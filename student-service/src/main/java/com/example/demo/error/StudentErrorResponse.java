package com.example.demo.error;

import java.util.Date;

public class StudentErrorResponse {
	
	private int status;
	private String message;
	private Date timeStamp;
	public StudentErrorResponse() {
		super();
	}
	public StudentErrorResponse(int status, String message, Date timeStamp) {
		super();
		this.status = status;
		this.message = message;
		this.timeStamp = timeStamp;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}
	

}
