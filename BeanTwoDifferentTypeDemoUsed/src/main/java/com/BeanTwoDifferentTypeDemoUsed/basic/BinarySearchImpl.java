/**
 * 
 */
package com.BeanTwoDifferentTypeDemoUsed.basic;

import org.springframework.beans.factory.annotation.Autowired;// added import for Autowired
import org.springframework.stereotype.Component;// added import of for Component

/**
 * @author troyt
 *
 */

@Component //The @Component tells spring to look for beans
public class BinarySearchImpl  {
	
	@Autowired // this tells spring that this instance variable is a dependency
	private SortAlgorithm sortAlgorithm;
	
	
	
	
	// Need to tell spring what are the beans
	// Need to tell spring what are the dependencies of a bean
	// Need to tell spring where to search for beans
	
	
	



	/**
	 * @param sortAlgorithm
	 */
	
	
	  public BinarySearchImpl(SortAlgorithm sortAlgorithm) { super();
	  this.sortAlgorithm = sortAlgorithm; }
	 


	
	  public int binarySearch(int[] numbers, int numberToSearchFor) {
	  
	  int[] results =sortAlgorithm.sort(numbers);
	  System.out.println(sortAlgorithm); //Return the results return 0; }
	return 3;
	 



}
}