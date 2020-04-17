package com.PostConstruct.scope;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.PostConstruct.basic.BinarySearchImpl;
import com.PostConstruct.Scan.*;

@SpringBootApplication// The @SpringBootApplication scans the package and the packages within the package... Makes spring know whats there
@ComponentScan("com.PostConstruct.Scan")
@ComponentScan("com.PostConstruct.basic")
public class PostConstructScopeApplication {

	// Need to tell spring what are the beans
		// Need to tell spring what are the dependencies of a bean
		// Need to tell spring where to search for beans -- No need to do this here
	public static void main(String[] args) {
		
	Logger LOGGER= LoggerFactory.getLogger(PostConstructScopeApplication.class);
	
		/*
		 * You want to get the binary search class from the spring application context. 
		 * The "spring application context" will maintain all of the beans
		 * 
		 * 
		 * */
		ApplicationContext applicationContext= SpringApplication.run(PostConstructScopeApplication.class,args);
		PersonDAO personDAO1=applicationContext.getBean(PersonDAO.class);
		PersonDAO personDAO2=applicationContext.getBean(PersonDAO.class);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		
		LOGGER.info("{}",personDAO1);
		LOGGER.info("{}",personDAO1.getJdbcConnection());
		LOGGER.info("{}",personDAO2);
		LOGGER.info("{}",personDAO2.getJdbcConnection());
		LOGGER.info("using post construct after this point.");
		
		
		binarySearch.postConstruct();// Right after the bean is created
		
		
	}

}
