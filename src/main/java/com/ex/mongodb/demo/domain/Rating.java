package com.ex.mongodb.demo.domain;

import org.springframework.data.mongodb.core.mapping.Document;

//@Document
public class Rating {

	private int totalRating;
	private Hotel hotel;
	
	protected Rating(){}
	
	public Rating(Hotel hotel, int totalRating)
	{
		this.hotel = hotel;
		this.totalRating = totalRating;
	}
	
	
	public int getTotalRating() {
		return totalRating;
	}
	public void setTotalRating(int totalRating) {
		this.totalRating = totalRating;
	}
	public Hotel getHotel() {
		return hotel;
	}
	public void setHotelName(Hotel hotelName) {
		this.hotel = hotelName;
	}
	
	@Override
	public String toString() {
		return "Raings [totalRating=" + totalRating + ", hotelName=" + hotel + "]";
	}
}
