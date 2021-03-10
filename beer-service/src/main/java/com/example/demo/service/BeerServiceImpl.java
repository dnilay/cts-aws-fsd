package com.example.demo.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.example.demo.model.Beer;

@Service
public class BeerServiceImpl implements BeerService {
	private List<Beer> beers=new ArrayList<>();
	private Map<Integer, Beer> map=new HashMap<Integer,Beer>();
	
	{
		map.put(1, new Beer(UUID.randomUUID().toString(), "Beer-1", "b1", 190));
		map.put(2,new Beer(UUID.randomUUID().toString(), "Beer-2", "b2", 180));
		map.put(3,new Beer(UUID.randomUUID().toString(), "Beer-3", "b3", 200));
		map.put(4,new Beer(UUID.randomUUID().toString(), "Beer-4", "b4", 310));
		
	}

	@Override
	public Collection<Beer> getAllBeer() {
		// TODO Auto-generated method stub
		Collection<Beer> c=map.values();
		return c;
	}

	@Override
	public Optional<Beer> getBeerById(Integer beerId) {
		// TODO Auto-generated method stub
		return Optional.of(map.get(beerId));
	}

}
