package com.springbean.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dog implements Animals{

	@Autowired
	private Animals animalCommands;
	

	
	/**
	 * @param animalCommands
	 */
	public Dog(Animals animalCommands) {
		super();
		this.animalCommands = animalCommands;
		
	}

	/**
	 * @param command
	 */
	

	@Override
	public void catSound() {
		// TODO Auto-generated method stub
		System.out.println("Hiss");
	}

	@Override
	public void catScratch() {
		// TODO Auto-generated method stub
		System.out.print(" Cat Open claws");
		
		
	}

	@Override
	public void dogBark() {
		// TODO Auto-generated method stub
		System.out.println("Bark!!!! Bark!!!!");
		
	}

	@Override
	public void dogBite() {
		// TODO Auto-generated method stub
		
		System.out.println("Dog Attempts to bite");
		
	}

	@Override
	public String callCommand(String command) {
		// TODO Auto-generated method stub
		System.out.println(command);
		return command;
	}

}
