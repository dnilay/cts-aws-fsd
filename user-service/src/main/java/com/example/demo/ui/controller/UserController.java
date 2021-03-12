package com.example.demo.ui.controller;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.UserService;
import com.example.demo.shared.UserDto;
import com.example.demo.ui.model.CreateUserRequestModel;
import com.example.demo.ui.model.CreateUserResponseModel;

@RestController
@RequestMapping("/api")
public class UserController {
	private Environment env;
	private UserService userService;
	
	@Autowired
	public UserController(Environment env,UserService userService) {
		this.env = env;
		this.userService=userService;
	}


	@PostMapping(
			consumes = {MediaType.APPLICATION_JSON_VALUE },
			produces = {MediaType.APPLICATION_JSON_VALUE },
			path = "/users"
			)

	public ResponseEntity<CreateUserResponseModel> createUser(@Validated @RequestBody CreateUserRequestModel userDetails)
	{
		
		ModelMapper modelMapper = new ModelMapper(); 
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		
		UserDto userDto = modelMapper.map(userDetails, UserDto.class);
		
		UserDto createdUser = userService.createUser(userDto);
		System.out.println(createdUser);
		CreateUserResponseModel returnValue = modelMapper.map(createdUser, CreateUserResponseModel.class);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(returnValue);

		
	}

}
