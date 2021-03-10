package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.example.demo.model.Beer;

@Service
public class BeerServiceImpl implements BeerService {
	private List<Beer> beers=new ArrayList<>();
	
	{
		beers.add(new Beer(UUID.randomUUID().toString(), "Beer-1", "b1", 190));
		beers.add(new Beer(UUID.randomUUID().toString(), "Beer-2", "b2", 180));
		beers.add(new Beer(UUID.randomUUID().toString(), "Beer-3", "b3", 200));
		beers.add(new Beer(UUID.randomUUID().toString(), "Beer-4", "b4", 310));
		
	}

	@Override
	public List<Beer> getAllBeer() {
		// TODO Auto-generated method stub
		return beers;
	}

}
