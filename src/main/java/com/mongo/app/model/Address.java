package com.mongo.app.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Address {
	@Id
	private String houseNumber;
	private String area;
	private String city;
	private String country;
	
	
	public Address() {
		
	}
	
	
	
	public Address(String houseNumber, String area, String city, String country) {
		super();
		this.houseNumber = houseNumber;
		this.area = area;
		this.city = city;
		this.country = country;
	}
	
	
	
	public String getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	

}
