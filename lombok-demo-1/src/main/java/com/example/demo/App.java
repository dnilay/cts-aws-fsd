package com.example.demo;

import java.util.UUID;


public class App 
{
    public static void main( String[] args )
    {
        Employee employee=new Employee("ABCD","John","Doe","john@email.com");
        Employee employee1=new Employee("ABCD","John","Doe","john@email.com");
        System.out.println(employee.equals(employee1));
       
        
    }
}
