package com.spring.SpringQuickStart.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class PersonDAO {

	@Autowired
	JdbcConnector jdbcConnector;

	public JdbcConnector getJdbcConnector() {
		return jdbcConnector;
	}

	public void setJdbcConnector(JdbcConnector jdbcConnector) {
		this.jdbcConnector = jdbcConnector;
	}
	
}
