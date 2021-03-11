package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Student;

public interface StudentService {
	public List<Student> getAllStudents();
	public Student getStudentById(Integer studentId);

}
