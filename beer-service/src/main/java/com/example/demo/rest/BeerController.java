package com.example.demo.rest;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Beer;
import com.example.demo.service.BeerService;

@RestController
public class BeerController {

	private BeerService beerService;

	@Autowired
	public BeerController(BeerService beerService) {
		this.beerService = beerService;
	}

	@GetMapping(path = "/beers", produces = "application/json")
	public ResponseEntity<Collection<Beer>> getAllBeer() {
		return ResponseEntity.ok(beerService.getAllBeer());

	}
	@GetMapping(path = "/beers/{beerId}")
	public ResponseEntity<Optional<Beer>> findBeerById(@PathVariable("beerId") Integer beerid)
	{
		return ResponseEntity.ok().body(beerService.getBeerById(beerid));
		
	}
}
