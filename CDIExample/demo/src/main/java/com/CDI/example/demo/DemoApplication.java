package com.CDI.example.demo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DemoApplication.class, args);
	Logger LOGGER = LoggerFactory.getLogger(DemoApplication.class);
		
		ApplicationContext context= SpringApplication.run(DemoApplication.class, args);
		
		MotorCycleEngineImpl motorCycleBlock=  context.getBean(MotorCycleEngineImpl.class);
		MotorCycleDAO motorcycleDAO=new MotorCycleDAO();
		MotorCycleDAO cycleDAO = context.getBean(MotorCycleDAO.class, motorcycleDAO);
		
		//cycleDAO.motorCycleContext is a String variable filled with strings   
		cycleDAO.motorCycleContext=cycleDAO.motorCycleMake + "\t"+cycleDAO.motorCycleModel+"\t" + cycleDAO.motorCycleYear;
		
		LOGGER.info("{}", motorCycleBlock);
		LOGGER.info("{}", motorCycleBlock.motorCycleEngine());
		/*motorCycleBlock.setMtDAO(cycleDAO) takes an object. In order for this to work, I needed to put the object reference cycleDAO without adding a dot notation to select
		 * a method or a different variable. Once I added it there , I used the get method to gain access to the MotorCycleDAO class directly and captured the string context
		 * stored in those string variables. I could have used setters and getters to prevent direct access to the variables. They could have been set here and extracted from
		 * a getter through the motorCycleBlock reference. 
		 * */
		motorCycleBlock.setMtDAO(cycleDAO);
		LOGGER.info("{} MotorCycleBlock reference",motorCycleBlock.getMtDAO().motorCycleMake +"\t"+motorCycleBlock.getMtDAO().motorCycleModel +"\t"+motorCycleBlock.getMtDAO().motorCycleYear);
		
      cycleDAO.setMotorCycleDAO(cycleDAO.motorCycleContext);
    
      LOGGER.info("{}",cycleDAO.getMotorCycleDAO());
	}

}
