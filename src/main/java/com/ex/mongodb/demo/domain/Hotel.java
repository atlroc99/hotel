package com.ex.mongodb.demo.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Hotels")
public class Hotel {

	@Id
	private String id; //in mongodb id is not an integer value -> objectId: is a tyep string
	private String name;
	
	@Indexed(direction = IndexDirection.ASCENDING)
	private int pricePerNight; //helps on filter -> making a filter on price per night
	private Address address;
	private List<Review> list;
	
	private Rating rating;

	protected Hotel() {
		list = new ArrayList<>();
	}

	public Hotel(String name, int pricePerNight, Address address, List<Review> list) {
		this.name = name;
		this.pricePerNight = pricePerNight;
		this.address = address;
		this.list = list;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Address getAddress() {
		return address;
	}

	public List<Review> getList() {
		return list;
	}

	public int getPricePerNight() {
		return pricePerNight;
	}
	
	public Rating getRating() {
		return rating;
	}

	public void setRating(Rating rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Hotel [id=" + id + ", name=" + name + ", address=" + address + ", list=" + list + "Rating: " + rating + "]";
	}

}
