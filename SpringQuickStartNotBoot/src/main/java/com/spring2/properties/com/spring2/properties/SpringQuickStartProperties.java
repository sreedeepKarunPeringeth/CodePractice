package com.spring2.properties;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ComponentScan
@PropertySource("classpath:app.properties")
public class SpringQuickStartProperties {

	public static void main(String[] args) {

		try(AnnotationConfigApplicationContext applicationContext= 
					new AnnotationConfigApplicationContext(SpringQuickStartProperties.class);
				){
			
			ExternalService service= applicationContext.getBean(ExternalService.class);
			
			
			System.out.println(service.getServiceURL());
			
		}
		
	}

};
