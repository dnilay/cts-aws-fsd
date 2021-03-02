package com.example.demo;

import java.util.UUID;

public class App 
{
    public static void main( String[] args )
    {
		/*
		 * Employee employee=new Employee("ABCD","John","Doe","john@email.com");
		 * Employee employee1=new Employee("ABCD","John","Doe","john@email.com");
		 * System.out.println(employee.equals(employee1)); log.info("success");
		 */
    	Employee employee=Employee.builder()
    			.employeeId(UUID.randomUUID().toString())
    			.firstName("John")
    			.lastName("Doe")
    			.email("john@email.com")
    			.build();
    	
    	System.out.println(employee.getEmail());
    	Employee employee2=new Employee(null, "aa", "bb", "cc");
        
    }
}
