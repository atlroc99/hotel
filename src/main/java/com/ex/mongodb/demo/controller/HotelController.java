package com.ex.mongodb.demo.controller;


import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ex.mongodb.demo.domain.Hotel;
import com.ex.mongodb.demo.domain.QHotel;
import com.ex.mongodb.demo.repositories.HotelRepository;
import com.querydsl.core.types.dsl.BooleanExpression;

@RestController
@RequestMapping("/hotels")
public class HotelController {
	
	private HotelRepository hotelRepository;
	
	public HotelController(HotelRepository hotelRepository) {
		this.hotelRepository = hotelRepository;
	}

	@GetMapping("/allHotels")
	public List<Hotel> getAllHotels()
	{
		return this.hotelRepository.findAll();
	}
	
	@RequestMapping(value="/newHotel", method=RequestMethod.POST)
	public void addHotel(@RequestBody Hotel hotel, HttpServletResponse response) throws IOException
	{
		if(hotel!=null)
		{
			this.hotelRepository.insert(hotel);
		}
		//response.sendRedirect("redirect:/homepage");
	}
	
	@PutMapping("/update")
	public void updateHotel(@RequestBody Hotel hotel)
	{
		this.hotelRepository.save(hotel);
	}
	
	@DeleteMapping("/delete/{id}")
	public void removeHotel(@PathVariable("id") String id)
	{
		this.hotelRepository.delete(id);
	}
	
	
	//Filter methods
	@GetMapping("/hotel/{id}")
	public Hotel getbyId(@PathVariable("id") String id)
	{
		return this.hotelRepository.findById(id);
	}
	
	@GetMapping("/filerByPrice/{maxPrice}")
	public List<Hotel> getByPricePerNight(@PathVariable("maxPrice") int maxPrice)
	{
		return this.hotelRepository.findByPricePerNightLessThan(maxPrice);
	}
	
	@GetMapping("/city/{city}")
	List<Hotel>findHotelByCity(@PathVariable("city")String city)
	{
		return this.hotelRepository.findByCity(city);
	}
	
	//hotels by country
	@GetMapping("/country/{country}")
	public List<Hotel> findHotelsByCountry(@PathVariable("country") String country)
	{
		//create a QueryClas
		QHotel qHotel = new QHotel("hotel");
		
		//Using the query class we create our filters
		BooleanExpression filtreByCountry = qHotel.address.country.eq(country);
		
		//now we need to exe the filter
		//we need to pass this filter to our Repository(hotelRepository) QueryDslPredicateExecutor
		//the QueryDslPredicateExecutor interface has a findALL method in which we can pass the filter
		
		return (List<Hotel>) this.hotelRepository.findAll(filtreByCountry);
	}
	
	
	//filter by multiple criteria
	//find hotels with price/night less than given amount and has at least rating > 7 
	@GetMapping("/getRecommanded/price/{maxPrice}/minRating/{minRating}")
	public List<Hotel> findByMultipleFilter(@PathVariable("maxPrice") int maxPrice, @PathVariable("minRating") int minRating)
	{
		QHotel qHotel = new QHotel("hotel");
		
		BooleanExpression filterByprice = qHotel.pricePerNight.lt(maxPrice);
		BooleanExpression filterByRate = qHotel.list.any().rating.gt(minRating);
		
		return (List<Hotel>) this.hotelRepository.findAll(filterByprice.and(filterByRate));
	}
}
