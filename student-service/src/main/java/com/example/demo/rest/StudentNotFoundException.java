package com.example.demo.rest;

public class StudentNotFoundException extends Throwable {
	
	private String message;

	public StudentNotFoundException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
	

}
