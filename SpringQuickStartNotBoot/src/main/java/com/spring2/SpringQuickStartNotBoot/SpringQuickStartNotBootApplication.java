package com.spring2.SpringQuickStartNotBoot;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.spring2.SpringQuickStartNotBoot")
public class SpringQuickStartNotBootApplication {

	public static void main(String[] args) {
		
		try(AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(SpringQuickStartNotBootApplication.class);){
				//SpringApplication.run(SpringQuickStartNotBootApplication.class, args);
		
		ComponentDAO componenctDAO1 = applicationContext.getBean(ComponentDAO.class);
		ComponentDAO componenctDAO2 = applicationContext.getBean(ComponentDAO.class);
		
		System.out.println(componenctDAO1);
		System.out.println(componenctDAO2);
		System.out.println(componenctDAO1.getComponentJdbcConnector());
		System.out.println(componenctDAO2.getComponentJdbcConnector());
		}
		// if not using try with resources
		//applicationContext.close();
	}
}
