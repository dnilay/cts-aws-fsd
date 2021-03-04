package com.example.demo;

import java.util.Random;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       try {
    	   Employee employee1=new Employee(new Random().nextInt(1000), "John");
    	   System.out.printf("%s  %d\n", employee1,employee1.hashCode());
    	   Employee employee2=(Employee) employee1.clone();
    	   employee2.setId(new Random().nextInt(1000));
    	   employee2.setName("Marry");
    	   System.out.printf("%s  %d\n", employee2,employee2.hashCode());
    	   Employee employee3=(Employee) employee2.clone();
    	   employee3.setId(new Random().nextInt(1000));
    	   employee3.setName("Doe");
    	   System.out.printf("%s  %d\n", employee3,employee3.hashCode());
		
	} catch (Exception e) {
		e.printStackTrace();
	}
    }
}
