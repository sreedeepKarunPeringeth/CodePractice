package com.spring.SpringQuickStart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BinarySearch {

	@Autowired
	@Qualifier("first")
	private SortingAlgo sortingAlgo;
	
	BinarySearch(SortingAlgo bs){
		this.sortingAlgo = bs;
	}
	
	public int search(int[] arr, int num){
		
		//BubbleSort bs = new BubbleSort();
		
		//SortingAlgo bs = (SortingAlgo) new BinarySearch();
		sortingAlgo.sort(arr);
		
		// search algorithm
		
		return 5;
	}
	
}
