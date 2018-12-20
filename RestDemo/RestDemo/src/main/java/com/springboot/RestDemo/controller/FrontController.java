package com.springboot.RestDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.RestDemo.service.BusinessLayer;

//@Controller
@RestController
public class FrontController {

	@Autowired
	BusinessLayer businessLayer;
	
	@GetMapping("/errorPage")
	public String errorUrl(){
		return "error page";
	}
	
	//@RequestMapping("/data")
	@GetMapping("/data")
	public String dataUrl(){
		return businessLayer.getData();
	}
	
	
}
