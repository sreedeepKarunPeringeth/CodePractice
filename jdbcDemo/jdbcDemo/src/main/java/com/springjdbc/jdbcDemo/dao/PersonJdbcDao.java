package com.springjdbc.jdbcDemo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springjdbc.jdbcDemo.beans.Individual;


@Repository
public class PersonJdbcDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Individual> fetchAll(){
		return jdbcTemplate.query("select * from PERSON", new BeanPropertyRowMapper<Individual>(Individual.class));
	}
	
	public Individual fetchById(int id){
		return jdbcTemplate.queryForObject("select * from PERSON where person_id= ?",new Object[]{id}, new BeanPropertyRowMapper<Individual>(Individual.class));
	}
	
}
