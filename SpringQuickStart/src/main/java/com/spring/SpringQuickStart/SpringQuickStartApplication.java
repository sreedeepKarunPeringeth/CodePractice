package com.spring.SpringQuickStart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import ch.qos.logback.core.net.SyslogOutputStream;

@SpringBootApplication
public class SpringQuickStartApplication {

	public static void main(String[] args) {
		
//		BinarySearch bs = new BinarySearch(new QuickSort());
//		
//		
//		int index = bs.search(new int[]{8,4,2},3);
//		
//		System.out.println("index: " + index);
		
		ApplicationContext applicationContext = SpringApplication.run(SpringQuickStartApplication.class, args);
		
		BinarySearch bs = applicationContext.getBean(BinarySearch.class,args);
		
		int index = bs.search(new int[]{8,4,2},3);
		
		System.out.println("index (component) : " + index);
	}
}
