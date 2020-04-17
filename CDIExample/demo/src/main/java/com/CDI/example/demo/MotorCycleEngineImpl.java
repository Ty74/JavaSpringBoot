package com.CDI.example.demo;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Named
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)

public class MotorCycleEngineImpl implements MotorCycleEngines {
	
	
	
	
	@Inject
	MotorCycleDAO mtDAO;

	public MotorCycleDAO getMtDAO() {
		return mtDAO;
	}

	public void setMtDAO(MotorCycleDAO mtDAO) {
		this.mtDAO = mtDAO;
	}

	/**
	 * @param motorcycleEngine
	 */
	public MotorCycleEngineImpl() {
		
	}

	@Override
	public String motorCycleEngine() {
		// TODO Auto-generated method stub
		return "1200cc VROD";
	}

	@Override
	public String getMotorCycleDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String setMotorCycleDAO(String context) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
