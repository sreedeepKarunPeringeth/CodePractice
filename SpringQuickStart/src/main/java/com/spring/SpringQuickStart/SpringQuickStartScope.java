package com.spring.SpringQuickStart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.spring.ComponentDAO;


@SpringBootApplication
@ComponentScan("com.spring")
public class SpringQuickStartScope {

	public static void main(String[] args) {

		
		ApplicationContext applicationContext = SpringApplication.run(SpringQuickStartScope.class, args);
		ComponentDAO componenentDao1= applicationContext.getBean(ComponentDAO.class);
		ComponentDAO componenentDao2= applicationContext.getBean(ComponentDAO.class);
		

		System.out.println(componenentDao1);
		System.out.println(componenentDao2);
		
		System.out.println(componenentDao1.getComponentJdbcConnector());
		System.out.println(componenentDao2.getComponentJdbcConnector());
		
		
	}

}
