package com.qualifier.qualifierdemo;
/*The @Qualifier Annotation is used in the united express file. If it is removed and used without an @Qualifier or an @Autowired annotation
 * spring will fail and it will not know where to obtain the data that it is receiving. If those are used without and @Component annotation
 * it will not work as well. The @Component annotation tells spring that it has a bean to view. If those does not exist, spring will not see 
 * classes. 
 * */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class QualifierdemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(QualifierdemoApplication.class, args);
		UnitedExpress ue=context.getBean(UnitedExpress.class);
	    Airline boeing =new Boeing();// This is from java. This is using polymorphism. This is using a blank constructor for access to the takeoff method from Boeing
	   System.out.println( boeing.takeOff("takeoff"));// This is from Spring context to gain access to the bean information. Also it is using the qualifier and not the @Autowired
	
		System.out.println(ue.takeOff("Fly United Express!!!"));
		
		
	}

}
