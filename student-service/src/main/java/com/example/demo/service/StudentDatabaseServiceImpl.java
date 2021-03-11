package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.demo.model.Student;
import com.example.demo.repo.StudentRepo;

@Service
@EnableTransactionManagement
public class StudentDatabaseServiceImpl implements StudentDatabaseService {

	private StudentRepo studentRepo;
	
	@Autowired
	public StudentDatabaseServiceImpl(StudentRepo studentRepo) {
		super();
		this.studentRepo = studentRepo;
	}

	@Transactional
	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepo.findAll();
	}

	@Transactional
	@Override
	public Optional<Student> getStudentById(Integer studentId) {
		// TODO Auto-generated method stub
		return studentRepo.findById(studentId);
	}

}
