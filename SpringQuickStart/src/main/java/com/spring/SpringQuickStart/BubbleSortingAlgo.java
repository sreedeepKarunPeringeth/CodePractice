package com.spring.SpringQuickStart;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("first")
public class BubbleSortingAlgo implements SortingAlgo{

	
	public void sort(int[] arr){
		System.out.println("--------BubbleSort---------");
		// sort logic
	}
	
}
