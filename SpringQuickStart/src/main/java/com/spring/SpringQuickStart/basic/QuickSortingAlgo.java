package com.spring.SpringQuickStart.basic;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("last")
public class QuickSortingAlgo implements SortingAlgo{

	private Logger logger =  LoggerFactory.getLogger(this.getClass());
	
	public void sort(int[] arr){
		logger.info("============QuickSortingAlgo==========");
		
		// sort logic
	}

	
	@PreDestroy
	public void preDestroy(){
		System.out.println("inside preDestroy of QuickSortingAlgo");
		//logger.info("inside preDestroy of QuickSortingAlgo");
	}
	
	@PostConstruct
	public void postContruct(){
		System.out.println("inside postContruct of QuickSortingAlgo");
		//logger.info("inside postContruct of QuickSortingAlgo");
	}
	
}
