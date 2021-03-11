package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Student;

public interface StudentDatabaseService {

	public List<Student> getAllStudents();
	public Optional<Student> getStudentById(Integer studentId);
}
