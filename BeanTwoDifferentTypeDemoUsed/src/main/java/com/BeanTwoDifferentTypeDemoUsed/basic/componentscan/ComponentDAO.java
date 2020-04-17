/**
 * 
 */
package com.BeanTwoDifferentTypeDemoUsed.basic.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;

/**
 * @author troyt
 *
 */
@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
/*
 * This Scope annotation only requires one parameter because this class is being called directly. If it were uncommented
 * it would produce a different signature response everytime. 
 * 
 * */
public class ComponentDAO {
	
	@Autowired
	ComponentJdbcConnection jdbcConnection;

	public ComponentJdbcConnection getJdbcConnection() {
		return jdbcConnection;
	}

	public void setJdbcConnection(ComponentJdbcConnection jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}

}
