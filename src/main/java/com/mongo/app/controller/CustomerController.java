package com.mongo.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.mongo.app.model.Customer;
import com.mongo.app.repository.CustomerRepositery;

public class CustomerController {
	
	@Autowired
	CustomerRepositery customerRepositery;

	@PostMapping
	public ResponseEntity<?> createBooking(@RequestBody Customer customer) {
		customer = customerRepositery.insert(customer);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}


	
	@GetMapping("/{customerId}")
	public ResponseEntity<Customer> fetchBookingByID(@PathVariable("customerId") String customerId) {
		Customer custDetails = customerRepositery.findById(customerId).get();
		return new ResponseEntity<>(custDetails,HttpStatus.CREATED);
	 }
	
	@PutMapping
	public ResponseEntity<Customer> updateBooking(@RequestBody Customer customerId) {
		customerId = customerRepositery.save(customerId);
		return new ResponseEntity<>(customerId,HttpStatus.CREATED);
	}
     @DeleteMapping("/{customerId}")
	public void  deleteBooking(@PathVariable("customerId") String customerId){
    	 customerRepositery.deleteById(customerId);
			
	 }

}
