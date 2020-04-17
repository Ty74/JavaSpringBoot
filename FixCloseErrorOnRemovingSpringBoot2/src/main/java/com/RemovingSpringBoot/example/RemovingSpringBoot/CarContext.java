/**
 * 
 */
package com.RemovingSpringBoot.example.RemovingSpringBoot;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

//import com.RemovingSpringBoot.example.RemovingSpringBoot.AutomobilesDAO;
import org.springframework.stereotype.Component;

/**
 * @author troyt
 *
 */
@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE,  proxyMode = ScopedProxyMode.TARGET_CLASS)
public class CarContext implements AutomobilesDAO {
	
@Autowired
AutomobilesDAO automobile;

	
public AutomobilesDAO getAutomobile() {
	return automobile;
}

public void setAutomobile(AutomobilesDAO automobile) {
	this.automobile = automobile;
}

/**
 * @param automobile
 */
public CarContext() {
	super();
	this.automobile = automobile;
}

@Override
public String make(String make) {
	// TODO Auto-generated method stub

	return make;
}
@Override
public String model(String model) {
	// TODO Auto-generated method stub
	
	return model;
}
@Override
public String year(String year) {
	// TODO Auto-generated method stub
	return year;
}

}
