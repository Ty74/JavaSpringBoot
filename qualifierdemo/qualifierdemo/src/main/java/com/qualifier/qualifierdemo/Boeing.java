package com.qualifier.qualifierdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;


@Component
public class Boeing implements Airline{
	
	@Autowired
	Airline airline;
	
	public Boeing( Airline airline) {
		this.airline
		=airline;
	}



	


	public Boeing() {
		// TODO Auto-generated constructor stub
	}






	@Override
	public String takeOff(String takeoff) {
		// TODO Auto-generated method stub
		return takeoff;
	}
	
	

}
