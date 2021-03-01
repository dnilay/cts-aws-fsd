package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.demo.model.Todo;

@Repository
@EnableTransactionManagement
public interface TodoDao extends JpaRepository<Todo, Integer>{

}
