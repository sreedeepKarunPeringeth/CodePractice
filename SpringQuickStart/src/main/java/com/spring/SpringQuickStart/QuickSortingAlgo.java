package com.spring.SpringQuickStart;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("last")
public class QuickSortingAlgo implements SortingAlgo{

	public void sort(int[] arr){
		System.out.println("--------QuickSort---------");
			// sort logic
	}

}
