package com.springjdbc.jdbcDemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springjdbc.jdbcDemo.dao.PersonJdbcDao;

@SpringBootApplication
public class JdbcDemoApplication implements CommandLineRunner{

	Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private PersonJdbcDao personJdbcDao;
	public static void main(String[] args) {
		SpringApplication.run(JdbcDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		logger.info("\ndetails: {}",personJdbcDao.fetchAll());
		logger.info("\nPerson with id 100: {}",personJdbcDao.fetchById(100));
	}

}

