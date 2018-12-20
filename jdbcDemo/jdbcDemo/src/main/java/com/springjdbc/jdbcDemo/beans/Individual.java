package com.springjdbc.jdbcDemo.beans;

import java.util.Date;

public class Individual {
	
	private int id;
	private String place;
	private String knownAs;
	private Date bornOn;
	public Individual() {
		super();
	}
	public Individual(int person_id, String location, String name, Date birth_date) {
		super();
		this.id = person_id;
		this.place = location;
		this.knownAs = name;
		this.bornOn = birth_date;
	}
	public int getPerson_id() {
		return id;
	}
	public void setPerson_id(int person_id) {
		this.id = person_id;
	}
	public String getLocation() {
		return place;
	}
	public void setLocation(String location) {
		this.place = location;
	}
	public String getName() {
		return knownAs;
	}
	public void setName(String name) {
		this.knownAs = name;
	}
	public Date getBirth_date() {
		return bornOn;
	}
	public void setBirth_date(Date birth_date) {
		this.bornOn = birth_date;
	}
	@Override
	public String toString() {
		return "\nPerson [person_id=" + id + ", location=" + place + ", name=" + knownAs + ", birth_date="
				+ bornOn + "]";
	}
	
	

}
