package com.mockito.MockitoDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MockitoDemoApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(MockitoDemoApplication.class, args);
		BusinessImpl businessImpl = applicationContext.getBean(BusinessImpl.class);
		
		businessImpl.getGreatestNumber();
	}

}

