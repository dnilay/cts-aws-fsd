package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Customer;

public interface CustomerDAO  extends JpaRepository<Customer, Integer>{

	/*
	 * public List<Customer> getCustomers();
	 * 
	 * public void saveCustomer(Customer theCustomer);
	 * 
	 * public Customer getCustomer(int theId);
	 * 
	 * public void deleteCustomer(int theId);
	 */
	
}
