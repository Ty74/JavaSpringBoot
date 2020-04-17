package com.RemovingSpringBoot.example.RemovingSpringBoot;






import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;//org.springframework.context.annotation.AnnotationConfigApplicationContext took the place of  SpringApplication.run(RemovingSpringBootApplication.class,args);
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;




import org.slf4j.Logger;// the logger is refusing to work for all the classes without using spring boot starter, tried various combinations in the .pom with slf4j none of them worked resorted to using the system out for the console

import org.slf4j.LoggerFactory;// the logger is refusing to work for all the classes without using spring boot starter, tried various combinations in the .pom with slf4j none of them worked resorted to using the system out for the console




@Configuration// This takes the place of @SpringBootApplication since the dependency was replaced with spring core
@ComponentScan
public class RemovingSpringBootApplication {

	private static final Logger logger = LoggerFactory.getLogger(RemovingSpringBootApplication.class); 
    


	

	public static void main(String[] args) {
		
	/*Commenting the line below this to clear the "Resource leak: 'applicationContext' is never closed" warning on the 'applicationContext' reference */
	//ApplicationContext applicationContext = new AnnotationConfigApplicationContext(RemovingSpringBootApplication.class);
		
		// The ApplicationContext class is substituted by "AnnotationConfigApplicationContext" because it has a close method associated with the class
		// I'm using Java 8 but Java 7 is what enabled the enclosing of an entire object within a try 
	try(AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(RemovingSpringBootApplication.class)){
	CarContext carContext =applicationContext.getBean(CarContext.class);
	CarContext carContext1 =applicationContext.getBean(CarContext.class);
    
   if(logger.isInfoEnabled()) {
	   /*
	    * The issue initially is that there wasn't any binder  for the slf4j. I found information regarding the issue at 
	    * http://www.slf4j.org/manual.html. It stated that binders needed to be added to the path. This is the error that it shows:
	    * 
	    * SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
          SLF4J: Defaulting to no-operation (NOP) logger implementation
          SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.
	    * It stated that the warning will disappear as soon as you add a binding to your class path. Assuming you add slf4j-simple-1.7.28.jar so that your class path contains:

             slf4j-api-1.7.28.jar
             slf4j-simple-1.7.28.jar
          I added the following to maven pom file per the spring master class author and it worked: 
          
          <dependency>
			<groupId>org.slf4j</groupId>
			<artifactId>slf4j-api</artifactId>
			<version>1.7.30</version>
		</dependency>
		<dependency>
			<groupId>ch.qos.logback</groupId>
			<artifactId>logback-classic</artifactId>
			
		</dependency>
		
		It worked after these two were 
          
      
	    * */
	   logger.info("INFO is enabled....."
	   		+ "");
	   logger.info("{}", carContext);//1st object shows a different number from the second object  because of @Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE,  proxyMode = ScopedProxyMode.TARGET_CLASS) placed into a different class
	   logger.info("{}", carContext1);//2nd object shows a different number from the first object because of @Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE,  proxyMode = ScopedProxyMode.TARGET_CLASS) placed into a different class
	   logger.info("Make \t", carContext.make("Old Mobile"));
	   logger.info("Model \t"+ carContext.model("Cutlass Calle"));
	   logger.info("Year \t"+ carContext.year("1974"));
	   
	   
   }else{
	   logger.info("INFO is not enabled");
   }
		 //This clears up the error that was on the 'applicationContext' Reference above
         // and it closes the Resource leak associated to the reference
         // Separately Java7 has a new trycatch that implements the AutoCloseable method that 
        // will close automatically should something occur
        // if that is being used which I am about to use it now and comment out 'applicationContext.close'
        // In order to use the line beloww uncomment it and remove the surrounding try from the code above
		// applicationContext.close();
		

	}
	 
	       
	}



}
