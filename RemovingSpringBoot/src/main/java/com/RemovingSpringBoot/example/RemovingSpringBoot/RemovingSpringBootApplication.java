package com.RemovingSpringBoot.example.RemovingSpringBoot;






import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;//org.springframework.context.annotation.AnnotationConfigApplicationContext took the place of  SpringApplication.run(RemovingSpringBootApplication.class,args);
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



import org.slf4j.Logger;// the logger is refusing to work for all the classes without using spring boot starter, tried various combinations in the .pom with slf4j none of them worked resorted to using the system out for the console

import org.slf4j.LoggerFactory;// the logger is refusing to work for all the classes without using spring boot starter, tried various combinations in the .pom with slf4j none of them worked resorted to using the system out for the console




@Configuration// This takes the place of @SpringBootApplication since the dependency was replaced with spring core
@ComponentScan
public class RemovingSpringBootApplication {

	private static final Logger logger = LoggerFactory.getLogger(RemovingSpringBootApplication.class); 
    


	

	public static void main(String[] args) {
		
	
		 ApplicationContext applicationContext = new AnnotationConfigApplicationContext(RemovingSpringBootApplication.class);
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
          I added the following to maven pom file: 
          
          <dependency>
			<groupId>org.slf4j</groupId>
			<artifactId>slf4j-api</artifactId>
			<version>1.7.30</version>
		</dependency>
		<dependency>
			<groupId>org.slf4j</groupId>
			<artifactId>slf4j-simple</artifactId>
			<version>1.7.30</version>
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
	

	 
	       
	}



}
