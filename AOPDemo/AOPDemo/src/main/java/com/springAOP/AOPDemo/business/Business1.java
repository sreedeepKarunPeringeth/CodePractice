package com.springAOP.AOPDemo.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springAOP.AOPDemo.aspect.TrackThis;
import com.springAOP.AOPDemo.data.Data1;

@Service
public class Business1 {

	@Autowired
	private Data1 data;
	
	@TrackThis
	public String logic(){
		
		try {
			return data.retrieveData();
		} catch (Exception e) {	
			e.printStackTrace();
		}
		return "ExceptionOccured";
	}
}
