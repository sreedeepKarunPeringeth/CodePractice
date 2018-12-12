package com.spring2.SpringQuickStartNotBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComponentDAO {

	@Autowired
	private ComponentJdbcConnector componentJdbcConnector;

	public ComponentJdbcConnector getComponentJdbcConnector() {
		return componentJdbcConnector;
	}

	public void setComponentJdbcConnector(ComponentJdbcConnector componentJdbcConnector) {
		this.componentJdbcConnector = componentJdbcConnector;
	}
	
	
}
