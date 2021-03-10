package com.example.demo.service;

import java.util.Collection;
import java.util.Optional;

import com.example.demo.model.Beer;

public interface BeerService {
	
	public Collection<Beer> getAllBeer();
	public Optional<Beer> getBeerById(Integer beerId);

}
