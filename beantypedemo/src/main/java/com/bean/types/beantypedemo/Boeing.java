/**
 * 
 */
package com.bean.types.beantypedemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author troyt
 *
 */
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)//This prototype will populate a different bean signature every time. It has to be on the class that is being called or the class that is using the @Component annotation and being called
//@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)// This singleton scope will produce bean signatures that are the same everytime a different bean is generated
public class Boeing implements Airlines {
	

	@Qualifier("boeing")//I resolved a circular depedency by not having @Autowired at the instance variable that includes a constructor with a parameter of airline. 
	Airlines airline;

	/**
	 * @param airline
	 */
	public Boeing() {
		
	}
	

	@Override
	public String airlineName(String name) {
		// TODO Auto-generated method stub
		return name;
	}

}
