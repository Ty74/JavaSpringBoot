package com.BeanTwoDifferentTypeDemoUsed.scope;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.BeanTwoDifferentTypeDemoUsed.basic.BinarySearchImpl;
import com.BeanTwoDifferentTypeDemoUsed.basic.componentscan.ComponentDAO;

@SpringBootApplication// The @SpringBootApplication scans the package and the packages within the package... Makes spring know whats there
@ComponentScan("com.BeanTwoDifferentTypeDemoUsed.basic.componentscan")
/*The @ComponentScan annotation will look for whatever classes are within the package that you should name wihtin the @ComponentScan annotation
 * */
public class Chapter6DemoComponentScanApplication {

	// Need to tell spring what are the beans
		// Need to tell spring what are the dependencies of a bean
		// Need to tell spring where to search for beans -- No need to do this here
	public static void main(String[] args) {
		
	Logger LOGGER= LoggerFactory.getLogger(Chapter6DemoComponentScanApplication.class);
	
		/*
		 * You want to get the binary search class from the spring application context. 
		 * The "spring application context" will maintain all of the beans
		 * 
		 * 
		 * */
		ApplicationContext applicationContext= SpringApplication.run(Chapter6DemoComponentScanApplication.class,args);
		ComponentDAO componentDAO1=applicationContext.getBean(ComponentDAO.class);
		
		
		LOGGER.info("{}",componentDAO1);
		
		
		
	}

}
