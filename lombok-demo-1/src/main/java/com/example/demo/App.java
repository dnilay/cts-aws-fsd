package com.example.demo;

import java.util.UUID;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App 
{
    public static void main( String[] args )
    {
        Employee employee=new Employee("ABCD","John","Doe","john@email.com");
        Employee employee1=new Employee("ABCD","John","Doe","john@email.com");
        System.out.println(employee.equals(employee1));
        log.info("success");
       
        
    }
}
