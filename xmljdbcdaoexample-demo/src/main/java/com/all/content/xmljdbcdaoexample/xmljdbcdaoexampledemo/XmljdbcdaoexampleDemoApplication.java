package com.all.content.xmljdbcdaoexample.xmljdbcdaoexampledemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.all.content.xmljdbcdaoexampledemo.car.info.Automobile;
import com.all.content.xmljdbcdaoexampledemo.car.info.CarInformation;


// The @ Configuration is used replace the Springboot annotation
@Configuration
/*This is the correct format for version 5 of spring using the component scan when the spring boot is not being used... component scan is not used in this version*/
@ComponentScan(basePackages = {"com.all.content.xmljdbcdaoexample.xmljdbcdaoexampledemo","com.all.content.xmljdbcdaoexample.xmljdbcdaoexampledemo.car.info"})
public class XmljdbcdaoexampleDemoApplication {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		
		
			
	Logger LOGGER= LoggerFactory.getLogger(XmljdbcdaoexampleDemoApplication.class);
             //ClassPathXmlApplicationContext is a wrapper class that acts as an appicationContext and it closes the stream when using a try catch block
		try( ClassPathXmlApplicationContext applicationContext= new ClassPathXmlApplicationContext("applicationContext.xml")){
			
			XDAO dao= applicationContext.getBean(XDAO.class);
			XDAO dao1= applicationContext.getBean(XDAO.class);
			Automobile auto =new  CarInformation();
			auto =applicationContext.getBean(CarInformation.class);
			
		dao.setName("Magic");
		LOGGER.info("{}",dao.getName());
		LOGGER.info("{}",dao1);
		LOGGER.info("{}",auto.make());
		LOGGER.info("{}",auto.model());
		LOGGER.info("{}",auto.year());
			
			
			
			
		
		
			
		
	}

	}
	}
	
