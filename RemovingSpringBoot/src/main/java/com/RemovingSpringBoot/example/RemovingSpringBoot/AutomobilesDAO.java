/**
 * 
 */
package com.RemovingSpringBoot.example.RemovingSpringBoot;

import org.springframework.stereotype.Component;

/**
 * @author troyt
 *
 */
@Component
public interface AutomobilesDAO {
	
	public String make(String make);
	public String model(String model);
	public String year(String year);

}
