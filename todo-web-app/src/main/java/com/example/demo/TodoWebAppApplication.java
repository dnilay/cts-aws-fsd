package com.example.demo;

import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.TodoDao;
import com.example.demo.model.Todo;

@SpringBootApplication
public class TodoWebAppApplication implements CommandLineRunner {

	private TodoDao todoDao;
	
	public TodoWebAppApplication(TodoDao todoDao) {
		super();
		this.todoDao = todoDao;
	}

	public static void main(String[] args) {
		SpringApplication.run(TodoWebAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		todoDao.save(new Todo(1, "Demo user1","demo desc-1", new Date(), false));
		todoDao.save(new Todo(2, "Demo user2","demo desc-2", new Date(), false));
		todoDao.save(new Todo(3, "Demo user3","demo desc-3", new Date(), false));
		todoDao.save(new Todo(4, "Demo user4","demo desc-4", new Date(), false));
		todoDao.save(new Todo(5, "Demo user5","demo desc-5", new Date(), false));
		
	}

}
