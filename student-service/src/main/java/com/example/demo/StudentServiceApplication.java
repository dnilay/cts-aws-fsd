package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Student;
import com.example.demo.repo.StudentRepo;

@SpringBootApplication
public class StudentServiceApplication implements CommandLineRunner{

	private StudentRepo repo;
	
	@Autowired
	public StudentServiceApplication(StudentRepo repo) {
		
		this.repo = repo;
	}

	public static void main(String[] args) {
		SpringApplication.run(StudentServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repo.save(new Student(1, "John", "Doe", "john@email.com"));
		repo.save(new Student(2, "Marry", "Public", "marry@email.com"));
		repo.save(new Student(3, "Sachin", "Tendulkar", "sachin@email.com"));
		repo.save(new Student(4, "Ajay", "Kumar", "ajay@email.com"));
		
	}

}
