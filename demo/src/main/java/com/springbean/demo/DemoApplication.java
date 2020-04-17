package com.springbean.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
	ApplicationContext appContext=	SpringApplication.run(DemoApplication.class, args);
	Dog animal=appContext.getBean(Dog.class);
	animal.dogBark();
	animal.callCommand("heal!!!");
	Cat animal2= appContext.getBean(Cat.class);
	animal2.catSound();
    animal.dogBite();
    animal2.catScratch();
    animal2.callCommand("Come cat! Come... Come Cat Come!!!!");
    animal.catSound();
    animal.catScratch();
    animal2.dogBite();
    animal.callCommand("Stop!!!!!");
    animal2.setYell("This is too much");
    System.out.println(animal2.getYell());
 
	

	
	}

}
