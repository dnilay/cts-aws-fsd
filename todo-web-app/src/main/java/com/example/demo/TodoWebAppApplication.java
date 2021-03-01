package com.example.demo;

import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.TodoDao;

@SpringBootApplication
public class TodoWebAppApplication /*implements CommandLineRunner*/ {

	private TodoDao todoDao;
	private static Logger logger=org.slf4j.LoggerFactory.getLogger(TodoWebAppApplication.class);
	public TodoWebAppApplication(TodoDao todoDao) {
		super();
		this.todoDao = todoDao;
	}

	public static void main(String[] args) {
		logger.debug("debiging TodoWebapp");
		SpringApplication.run(TodoWebAppApplication.class, args);
	}

	/*
	 * @Override public void run(String... args) throws Exception { todoDao.save(new
	 * Todo(1, "Demo user1","demo desc-1", new Date(), false)); todoDao.save(new
	 * Todo(2, "Demo user2","demo desc-2", new Date(), false)); todoDao.save(new
	 * Todo(3, "Demo user3","demo desc-3", new Date(), false)); todoDao.save(new
	 * Todo(4, "Demo user4","demo desc-4", new Date(), false)); todoDao.save(new
	 * Todo(5, "Demo user5","demo desc-5", new Date(), false));
	 * 
	 * }
	 */

}
