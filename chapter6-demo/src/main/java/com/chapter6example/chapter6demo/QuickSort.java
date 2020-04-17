/**
 * 
 */
package com.chapter6example.chapter6demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author troyt
 *
 */
@Component
public class QuickSort implements SortAlgorithm{

	public int[] sort(int[] numbers) {
		return numbers.clone();
		 
		
	
	}

	@Override
	public int[] bubbleSort(int[] numbers) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	
	
	 
	   


}
