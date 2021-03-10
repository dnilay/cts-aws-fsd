package org.example.jackson_demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
        	ObjectMapper mapper=new ObjectMapper();
        	Student student=mapper.readValue(new File("sample.json"), Student.class);
        	System.out.println(student);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    }
}
