package com.mongo.app.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongo.app.model.Booking;

import com.mongo.app.repository.BookingRepository;



@RestController
@RequestMapping("/api/v1/booking")
public class BookingController {
	

	@Autowired
	BookingRepository bookingRepository;

	@PostMapping
	public ResponseEntity<?> createBooking(@RequestBody Booking booking) {
		booking = bookingRepository.insert(booking);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@GetMapping
	public ResponseEntity<?> getallBooking() {
		List<Booking> booking = bookingRepository.findAll();
		return new ResponseEntity<>(booking,HttpStatus.CREATED);
	}
	
	@GetMapping("/{bookingID}")
	public ResponseEntity<?> fetchBookingByID(@PathVariable("bookingID") String bookingid) {
		Booking booking = bookingRepository.findById(bookingid).get();
		return new ResponseEntity<>(booking,HttpStatus.CREATED);
	 }
	
	@PutMapping
	public ResponseEntity<?> updateBooking(@RequestBody Booking booking) {
		 booking = bookingRepository.save(booking);
		return new ResponseEntity<>(booking,HttpStatus.CREATED);
	}
     @DeleteMapping("/{bookingID}")
	public void  deleteBooking(@PathVariable("bookingID") String bookingid){
    	 bookingRepository.deleteById(bookingid);
			
	 }
	}
