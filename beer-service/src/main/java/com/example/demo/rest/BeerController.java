package com.example.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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
	public ResponseEntity<List<Beer>> getAllBeer() {
		return ResponseEntity.ok(beerService.getAllBeer());

	}
}
