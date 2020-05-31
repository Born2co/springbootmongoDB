package com.mongo.app.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Booking {
	
	@Id
	private String bookingId;
	private String bookingType;
	private String bookingLocation;
	
	public Booking() {
		
	}

	public Booking(String bookingId, String bookingType, String bookingLocation) {
		super();
		this.bookingId = bookingId;
		this.bookingType = bookingType;
		this.bookingLocation = bookingLocation;
	}

	public String getBookingId() {
		return bookingId;
	}

	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}

	public String getBookingType() {
		return bookingType;
	}

	public void setBookingType(String bookingType) {
		this.bookingType = bookingType;
	}

	public String getBookingLocation() {
		return bookingLocation;
	}

	public void setBookingLocation(String bookingLocation) {
		this.bookingLocation = bookingLocation;
	}
	
	
	
}
	
	