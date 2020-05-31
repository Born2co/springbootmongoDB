package com.mongo.app.model;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document
public class Customer {
	@Id
	private String customerId;
	private String customerName;
	private Address address;
	private Collection<Product> products = new ArrayList();
	
	
	
	public Customer(String customerId, String customerName, Address address, Collection<Product> products) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.address = address;
		this.products = products;
	}



	public String getCustomerId() {
		return customerId;
	}



	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}



	public String getCustomerName() {
		return customerName;
	}



	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}



	public Address getAddress() {
		return address;
	}



	public void setAddress(Address address) {
		this.address = address;
	}



	public Collection<Product> getProducts() {
		return products;
	}



	public void setProducts(Collection<Product> products) {
		this.products = products;
	}
	
	
	
	
	

}
