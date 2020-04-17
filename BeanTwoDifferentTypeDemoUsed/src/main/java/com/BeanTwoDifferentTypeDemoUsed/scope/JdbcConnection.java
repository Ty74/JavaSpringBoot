package com.BeanTwoDifferentTypeDemoUsed.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode=ScopedProxyMode.TARGET_CLASS)
/*
 * Within this scope annotation, it requires two different parameters one being the " value=ConfigurableBeanFactory.SCOPE_PROTOTYPE"
 * and the other being "proxyMode=ScopedProxyMode.TARGET_CLASS". Because the JdbcConnection class is not being called directly from the 
 * main class, but indirectly, it causes the output to display as if it were a singleton response without these to scope parameters added.
 * This means that the signature numbers of the response will be the same for each instance even though they are different instances.
 * However, with those two parameters added , each response will show different signature numbers. 
 * 
 * 
 * */
public class JdbcConnection {
	
	@Autowired
	public JdbcConnection() {
		System.out.println("JDBC Connection");
	}

}
