package com.spring.SpringQuickStart;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring.SpringQuickStart.basic.BinarySearch;


@SpringBootApplication
public class SpringQuickStartBasics {

	
	public static void main(String[] args) {
		
//		BinarySearch bs = new BinarySearch(new QuickSort());
//		
//		
//		int index = bs.search(new int[]{8,4,2},3);
//		
//		System.out.println("index: " + index);
		
		ApplicationContext applicationContext = SpringApplication.run(SpringQuickStartBasics.class, args);
		
		BinarySearch bs = applicationContext.getBean(BinarySearch.class);
		BinarySearch bs1 = applicationContext.getBean(BinarySearch.class);
		
		System.out.println(bs);
		System.out.println(bs1);
		int index = bs.search(new int[]{8,4,2},3);
		System.out.println("index (component) :  " + index);
		
	}
}
