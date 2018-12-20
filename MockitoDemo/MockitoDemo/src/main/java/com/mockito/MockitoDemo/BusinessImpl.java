package com.mockito.MockitoDemo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.mockito.MockitoDemo.Interface.DataService;


@Service
public class BusinessImpl {

	@Autowired
	public DataService dataService;
	
	public int getGreatestNumber(){
		
		int[] data= dataService.retriveAllData();
		int greatest = Integer.MIN_VALUE;
		if(data != null){
			for(int value: data){
				if(value > greatest)
					greatest= value;
			}
		}
		return greatest;
	}
	
	@PostConstruct
	public void postConstruct(){
		System.out.println("postContruct of BusinessImpl");
	}
}
