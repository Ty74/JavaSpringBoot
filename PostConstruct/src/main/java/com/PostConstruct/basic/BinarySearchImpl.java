/**
 * 
 */
package com.PostConstruct.basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;// added import for Autowired
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;// added import of for Component



/**
 * @author troyt
 *
 */

@Component //The @Component tells spring to look for beans
@Primary
public class BinarySearchImpl  {
	
	Logger logger = LoggerFactory.getLogger(BinarySearchImpl.class);
	@Autowired // this tells spring that this instance variable is a dependency
	//@Qualifier("Binary")
	private SortAlgorithm sortAlgorithm;
	
	
	
	
	// Need to tell spring what are the beans
	// Need to tell spring what are the dependencies of a bean
	// Need to tell spring where to search for beans
	
	
	



	/**
	 * @param sortAlgorithm
	 */
	
	
	  public BinarySearchImpl(SortAlgorithm sortAlgorithm) { 
	  super();
	  this.sortAlgorithm = sortAlgorithm; }
	 


	
	  public int binarySearch(int[] numbers, int numberToSearchFor) {
	  
	  int[] results =sortAlgorithm.sort(numbers);
	  System.out.println(sortAlgorithm); //Return the results return 0; }
	return 3;
	 
}
	  /*Use this right after the beans have come available and you would like something to happen at that point
	   * */
	  @PostConstruct
	  public void postConstruct() {
		  logger.info("postConstruct");
	  }
	  
	  /*THis is used just before the bean is moved out of context 
	   * The predestroy is used on methods as a callback
	   * */
	  @PreDestroy
	  public void preDestroy() {
		  logger.info("preDestroy");
	  }
}