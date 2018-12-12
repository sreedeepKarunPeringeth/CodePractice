package com.spring.SpringQuickStart.basic;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component //@Named -- Jee convention nameing(CDI)
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearch {

	private Logger logger =  LoggerFactory.getLogger(this.getClass());
	
	@Autowired //@Inject -- Jee convention nameing(CDI)
	@Qualifier("last")
	private SortingAlgo sortingAlgo;
	
	public int search(int[] arr, int num){
		
		//BubbleSort bs = new BubbleSort();
		
		//SortingAlgo bs = (SortingAlgo) new BinarySearch();
		
		sortingAlgo.sort(arr);
		
		// search algorithm
		
		return 5;
	}
	
	@PreDestroy
	public void preDestroy(){
		System.out.println("inside preDestroy of BinarySearch");
		//logger.info("inside preDestroy of BinarySearch");
	}
	
	@PostConstruct
	public void postContruct(){
		System.out.println("inside postContruct of BinarySearch");
		//logger.info("inside postContruct of BinarySearch");
	}
	
}
