package com.spring2.xml;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringQuickStartXmlContext {

	public static void main(String[] args) {
		
		try(ClassPathXmlApplicationContext applicationContext=
						new ClassPathXmlApplicationContext("applicationContext.xml");){
			
			XmlComponentDAO xmlComponentDao1= applicationContext.getBean(XmlComponentDAO.class);
			XmlComponentDAO xmlComponentDao2= applicationContext.getBean(XmlComponentDAO.class);
			
			
			System.out.println(Arrays.toString(applicationContext.getBeanDefinitionNames()));
			
			System.out.println(xmlComponentDao1);
			System.out.println(xmlComponentDao1.getXmlJdbcConnector());
			System.out.println(xmlComponentDao2);
			System.out.println(xmlComponentDao2.getXmlJdbcConnector());
			
		}
		
	}
}
