package com.mongo.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mongo.app.model.Customer;
	@Transactional
	@Repository
	public interface CustomerRepositery extends MongoRepository<Customer, String> {


	}


