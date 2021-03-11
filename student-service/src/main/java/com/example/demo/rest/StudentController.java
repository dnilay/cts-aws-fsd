package com.example.demo.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {
	
	private StudentService studentService;

	@Autowired
	public StudentController(StudentService studentService) {
		this.studentService = studentService;
	}
	
	@GetMapping(path = "/students")
	public ResponseEntity<List<Student>> getAllStudents()
	{
		return ResponseEntity.ok().body(studentService.getAllStudents());
	}
	
	@GetMapping(path = "/students/{studentId}")
	public ResponseEntity<Optional<Student>> getStudentByid(@PathVariable("studentId") Integer studentId) throws StudentNotFoundException
	{
		Optional<Student> student=Optional.of(studentService.getStudentById(studentId));
		System.out.println(student);
		if(student.get()==null)
		{
			System.out.println("------------hello--------");
			throw new StudentNotFoundException("student not fount with id: "+studentId); 
		}
		return ResponseEntity.ok().body(Optional.of(studentService.getStudentById(studentId)));
	}

	
}
