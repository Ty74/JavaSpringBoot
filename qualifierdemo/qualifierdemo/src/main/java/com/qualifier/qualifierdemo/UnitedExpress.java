/**
 * 
 */
package com.qualifier.qualifierdemo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;


/**
 * @author troyt
 *
 */
@Component
public class UnitedExpress implements Airline{
	

    //@Autowired
	@Qualifier("bubble")// if the @Autowired is not used , a qualifiere cna be used for the spring context to recognize that there is a bean 
	Airline airline;
	
	public UnitedExpress( Airline airline) {
		this.airline = airline;
	}
	
	public String takeOff( String takeoff) {
		// TODO Auto-generated method stub
		
		return takeoff;
	}

}
