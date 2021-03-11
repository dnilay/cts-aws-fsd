package com.example.demo.error;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StudentRestExceptionHandler {
	@ExceptionHandler
	public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException studentNotFoundException)
	{
		StudentErrorResponse studentErrorResponse=new StudentErrorResponse();
		studentErrorResponse.setStatus(HttpStatus.NOT_FOUND.value());
		studentErrorResponse.setMessage(studentNotFoundException.getMessage());
		studentErrorResponse.setTimeStamp(new Date());
		return new ResponseEntity<StudentErrorResponse>(studentErrorResponse,HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler
	public ResponseEntity<StudentErrorResponse> handleGlobalException(NumberFormatException e)
	{
		StudentErrorResponse studentErrorResponse=new StudentErrorResponse();
		studentErrorResponse.setStatus(HttpStatus.BAD_REQUEST.value());
		studentErrorResponse.setMessage("provide only Integer as path variable.");
		studentErrorResponse.setTimeStamp(new Date());
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(studentErrorResponse);
	}

}
