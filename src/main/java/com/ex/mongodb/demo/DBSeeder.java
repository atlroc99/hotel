package com.ex.mongodb.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ex.mongodb.demo.domain.Address;
import com.ex.mongodb.demo.domain.Hotel;
import com.ex.mongodb.demo.domain.Review;
import com.ex.mongodb.demo.repositories.HotelRepository;

@Component
public class DBSeeder implements CommandLineRunner {

	private HotelRepository hotelRepository;
	
	public DBSeeder(HotelRepository hotelRepository) {
		this.hotelRepository = hotelRepository;
	}
	
	@Override
	public void run(String... args) throws Exception {

		Hotel marroit = new Hotel("Marriott", 130, new Address("Paris", "France"),
				Arrays.asList(
							new Review("Jon", 8, true), 
							new Review("Yasmin", 7, true),
							new Review("Mike", 6, true), 
							new Review("Yollanda", 5, true)));
		
		Hotel ibis = new Hotel("Ibis", 119, new Address("Amsterdam", "Holland"),
				Arrays.asList(
							new Review("Jon", 8, true), 
							new Review("Yasmin", 7, true),
							new Review("Mike", 6, true), 
							new Review("Yollanda", 5, true)));
		
		Hotel westin = new Hotel("Westin", 299, new Address("Brassules", "Belgium"),
				Arrays.asList(
							new Review("Jon", 8, true), 
							new Review("Yasmin", 7, true),
							new Review("Mike", 6, true), 
							new Review("Yollanda", 5, true)));
		
		Hotel holidayInn = new Hotel("HolidayInn", 99, new Address("Atlanta", "USA"),
				Arrays.asList(
							new Review("Jon", 4, true), 
							new Review("Yasmin", 6, true),
							new Review("Mike", 9, true), 
							new Review("Yollanda", 7, true)));
		
		Hotel fairFieldMarriott = new Hotel("Marriott Fari Field", 99, new Address("Atlanta", "USA"), new ArrayList<Review>());
		
		//drop all table
		dropAllTable();
		
		//add all hotels
		
		List<Hotel> listOfHotels = addHotelsToDb(Arrays.asList(marroit, ibis, westin, holidayInn, fairFieldMarriott));
	}

	
	public void dropAllTable()
	{
		hotelRepository.deleteAll();
		System.out.println("all tables dropped!");
	}
	
	public List<Hotel> addHotelsToDb(List<Hotel> hotels)
	{
			return hotelRepository.save(hotels);
	}
	
}
