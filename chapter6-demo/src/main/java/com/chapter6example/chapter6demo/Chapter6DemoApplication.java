package com.chapter6example.chapter6demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication// The @SpringBootApplication scans the package and the packages within the package... Makes spring know whats there
public class Chapter6DemoApplication {

	// Need to tell spring what are the beans
		// Need to tell spring what are the dependencies of a bean
		// Need to tell spring where to search for beans -- No need to do this here
	public static void main(String[] args) {
		
		
		/*
		 * You want to get the binary search class from the spring application context. 
		 * The "spring application context" will maintain all of the beans
		 * 
		 * 
		 * */
		ApplicationContext applicationContext= SpringApplication.run(Chapter6DemoApplication.class,args);
		BinarySearchImpl binarySearch=applicationContext.getBean(BinarySearchImpl.class);
		
		int [] array= {7,4,3};
		
	    
		int result = binarySearch.binarySearch(array, 7);
		System.out.println(result);
	}

}
