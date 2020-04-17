/**
 * 
 */
package com.PostConstruct.Scan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.PostConstruct.scope.JdbcConnection;

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
public class PersonDAO {
	
	@Autowired
	JdbcConnection jdbcConnection;

	public JdbcConnection getJdbcConnection() {
		return jdbcConnection;
	}

	public void setJdbcConnection(JdbcConnection jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}

}
