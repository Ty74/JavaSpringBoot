package com.springbean.demo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class Cat implements Animals {
	private static Log log=LogFactory.getLog(Cat.class);
	@Autowired
	private Animals animalCommands;
	
    
    String yell;
	
	public String getYell() {
		return yell;
	}

	public void setYell(String yell) {
		this.yell = yell;
	}

	/**
	 * @param animalCommands
	 */
	public Cat(@Lazy Animals animalCommands) {
		super();
		this.animalCommands = animalCommands;
		
	}

	@Override
	public void catSound() {
		// TODO Auto-generated method stub
		System.out.println("Hiss");
	}

	@Override
	public void catScratch() {
		// TODO Auto-generated method stub
		System.out.print("Claw Dog");
		
		
	}

	@Override
	public void dogBark() {
		// TODO Auto-generated method stub
		System.out.println("Growl Bark");
		
	}

	@Override
	public void dogBite() {
		// TODO Auto-generated method stub
		
		System.out.println("Mall Dog");
		
	}

	@Override
	public String callCommand(String command ) {
		// TODO Auto-generated method stub
		System.out.println(command);
		return command;
	}
}
