package com.example.demo.model;

public class Beer {
	private String beerId;
	private String beerName;
	private String upc;
	private double price;
	public Beer() {
		super();
	}
	public Beer(String beerId, String beerName, String upc, double price) {
		super();
		this.beerId = beerId;
		this.beerName = beerName;
		this.upc = upc;
		this.price = price;
	}
	public String getBeerId() {
		return beerId;
	}
	public void setBeerId(String beerId) {
		this.beerId = beerId;
	}
	public String getBeerName() {
		return beerName;
	}
	public void setBeerName(String beerName) {
		this.beerName = beerName;
	}
	public String getUpc() {
		return upc;
	}
	public void setUpc(String upc) {
		this.upc = upc;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Beer [beerId=" + beerId + ", beerName=" + beerName + ", upc=" + upc + ", price=" + price + "]";
	}
	
	

}
