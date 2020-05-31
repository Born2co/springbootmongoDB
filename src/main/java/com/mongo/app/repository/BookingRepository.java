package com.mongo.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.transaction.annotation.Transactional;

import com.mongo.app.model.Booking;



@Transactional
public interface BookingRepository extends MongoRepository<Booking, String> {


}
