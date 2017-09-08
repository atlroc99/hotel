package com.ex.mongodb.demo.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.stereotype.Repository;

import com.ex.mongodb.demo.domain.Hotel;

@Repository
public interface HotelRepository extends MongoRepository<Hotel, String>, QueryDslPredicateExecutor<Hotel>{
	
	Hotel findById(String id);
	
	List<Hotel> findByName(String name);	

	List<Hotel> findByAddress(String city, String country);
	
	//filtering the elements by priceBynight maxPrice will take a param and return hotels with prices that are less than the maxPrice
	List<Hotel> findByPricePerNightLessThan(int maxPrice);
	
	@Query(value = "{address.city:?0}")
	List<Hotel> findByCity(String city);
	
}
