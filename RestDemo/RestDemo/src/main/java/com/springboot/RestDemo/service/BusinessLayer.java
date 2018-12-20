package com.springboot.RestDemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.RestDemo.data.DataLayer;

@Service
public class BusinessLayer {

	@Autowired
	DataLayer dataLayer;
	
	public String getData(){
		return dataLayer.retriveData();
	}
}
