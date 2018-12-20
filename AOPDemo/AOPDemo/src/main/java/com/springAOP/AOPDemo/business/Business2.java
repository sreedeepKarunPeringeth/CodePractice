package com.springAOP.AOPDemo.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springAOP.AOPDemo.data.Data2;

@Service
public class Business2 {

	@Autowired
	private Data2 data;
	
	public String logic(){
		
		return data.retrieveData();
	}
}
