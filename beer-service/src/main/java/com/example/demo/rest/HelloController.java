package com.example.demo.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping(path = "/hello",produces = "application/json")
	public ResponseEntity<String> sayHello(@RequestParam("name") String name)
	{
		return ResponseEntity.ok().body("Hello "+name);
		
	}

}
