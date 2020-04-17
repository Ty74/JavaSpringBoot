package com.CDI.example.demo;



import javax.inject.Inject;
import javax.inject.Named;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



@Named// Acts as the @Component
public class MotorCycleDAO implements MotorCycleEngines{

	Logger logger = LoggerFactory.getLogger(MotorCycleDAO.class);
	
	
	protected String motorCycleMake="Harley Davidson";
	
	protected String motorCycleModel="VROD"; 
	
	protected String motorCycleYear="2014";
	

	protected String motorCycleContext="";
	
	@Inject// Acts as the Autowire
	public MotorCycleDAO() {
	
		
		
		 getMotorCycleDAO();
		
	}
	@Override
	public String getMotorCycleDAO() {
		return motorCycleContext;
		}
	@Override
	public String setMotorCycleDAO(String context) {
		  motorCycleContext = "{"+context +"}";
		return motorCycleContext;
		
		
	}

	@Override
	public String motorCycleEngine() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
}
