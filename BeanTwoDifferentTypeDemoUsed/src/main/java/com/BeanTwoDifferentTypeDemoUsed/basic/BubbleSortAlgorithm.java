/**
 * 
 */
package com.BeanTwoDifferentTypeDemoUsed.basic;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author troyt
 *
 */
@Component//The @Component tells spring to look for beans
@Primary
public class BubbleSortAlgorithm implements SortAlgorithm{
	
	public int[] bubbleSort(int[] numbers) {
		//logic for bubble sort
		
		 
	       
		return numbers;
	}

	@Override
	public int[] sort(int[] numbers) {
		// TODO Auto-generated method stub
		return null;
	}

	
	


}
