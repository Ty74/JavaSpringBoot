package com.bean.types.beantypedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;

@SpringBootApplication

public class BeantypedemoApplication {

	public static void main(String[] args) {
		Airlines airline = null;
		
		ApplicationContext context =SpringApplication.run(BeantypedemoApplication.class, args);
		
		Boeing boeing =context.getBean(Boeing.class);
	
		Boeing boeing1=context.getBean(Boeing.class);
		System.out.println("-------------------------------------------------------------------------------"+"\n\n");

		System.out.println("Types of beans:\n singleton-One instance per Spring Context \n prototype - New bean whenever requested  \n request- One bean per HTTTP request  \n session - One bean per HTTP session\n\n By default: the instances are singleton but by using the 'scope' annotation, the instance's functionality can be changed into one of the other scopes(ie. prototype, request, session");

		System.out.println("--------Two different instances utilizes the same bean context.----------- " +"\n\n");
		System.out.println("This bean is the boeing instance. ");
		System.out.println(boeing+"\n\n");
		System.out.println("This bean is the boeing1 instance ");
		System.out.println(boeing1+"\n\n");
		System.out.println("Both instances has the same bean number : except when the Scope("+'"'+
		"prototype"+'"' +") is being called-" + boeing1);
	}

}
