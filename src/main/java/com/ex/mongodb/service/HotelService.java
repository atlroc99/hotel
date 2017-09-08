package com.ex.mongodb.service;

import java.util.List;

import com.ex.mongodb.demo.domain.Hotel;

public interface HotelService 
{
	
	List<Hotel> findByRatin();

}
