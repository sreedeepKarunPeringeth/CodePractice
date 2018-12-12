package com.spring.SpringQuickStart.basic;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("first")
public class BubbleSortingAlgo implements SortingAlgo{

	private Logger logger =  LoggerFactory.getLogger(this.getClass());
	
	public void sort(int[] arr){
		logger.info("==========BubbleSortingAlgo==========");
		
		// sort logic
		
	}
	
	@PreDestroy
	public void preDestroy(){
		System.out.println("inside preDestroy of BubbleSortingAlgo");
		//logger.info("inside preDestroy of BubbleSortingAlgo");
	}
	
	@PostConstruct
	public void postContruct(){
		System.out.println("inside postContruct of BubbleSortingAlgo");
		//logger.info("inside postContruct of BubbleSortingAlgo");
	}
	
}
