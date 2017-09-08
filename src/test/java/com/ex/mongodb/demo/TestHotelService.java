package com.ex.mongodb.demo;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ex.mongodb.demo.domain.Hotel;
import com.ex.mongodb.demo.domain.Rating;
import com.ex.mongodb.demo.domain.Review;
import com.ex.mongodb.demo.repositories.HotelRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestHotelService {

	
	@Autowired
	private HotelRepository hotelRepository;
	
	@Ignore
	@Test
	public void testFindByRatin() {

		String twoStars, threeStars, foursStars, fiveStars;
		
		int totalRating;
		
		List<Hotel> hotels = hotelRepository.findAll();
		for(Hotel hotel : hotels)
		{
			totalRating = 0;
			List<Review> reviews = hotel.getList();
			
			for(Review rating : reviews)
			{
				totalRating += rating.getRating();
			}
			hotel.setRating(new Rating(hotel, totalRating));
			System.out.println("Hotel: " + hotel.getName() + " Rating: " + hotel.getRating());
		}
	}
}
