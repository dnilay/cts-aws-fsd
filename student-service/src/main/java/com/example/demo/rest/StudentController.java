package com.example.demo.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentDatabaseService;

@RestController
public class StudentController {

	/*
	 * private StudentService studentService;
	 * 
	 * @Autowired public StudentController(StudentService studentService) {
	 * this.studentService = studentService; }
	 * 
	 * 
	 * @ExceptionHandler public ResponseEntity<StudentErrorResponse>
	 * handleException(StudentNotFoundException studentNotFoundException) {
	 * StudentErrorResponse studentErrorResponse=new StudentErrorResponse();
	 * studentErrorResponse.setStatus(HttpStatus.NOT_FOUND.value());
	 * studentErrorResponse.setMessage(studentNotFoundException.getMessage());
	 * studentErrorResponse.setTimeStamp(new Date()); return new
	 * ResponseEntity<StudentErrorResponse>(studentErrorResponse,HttpStatus.
	 * NOT_FOUND); }
	 * 
	 * 
	 * @GetMapping(path = "/students") public ResponseEntity<List<Student>>
	 * getAllStudents() { return
	 * ResponseEntity.ok().body(studentService.getAllStudents()); }
	 * 
	 * @GetMapping(path = "/students/{studentId}") public ResponseEntity<Student>
	 * getStudentByid(@PathVariable("studentId") Integer studentId) throws
	 * StudentNotFoundException { Student
	 * student=studentService.getStudentById(studentId); if(student==null) { throw
	 * new StudentNotFoundException("student not found with id: "+studentId); }
	 * return ResponseEntity.ok().body((studentService.getStudentById(studentId)));
	 * }
	 */

	private StudentDatabaseService studentDatabaseService;

	@Autowired
	public StudentController(StudentDatabaseService studentDatabaseService) {

		this.studentDatabaseService = studentDatabaseService;
	}

	@GetMapping(path = "/students",produces = "application/json")
	public ResponseEntity<List<Student>> getAllStudents() {
		return ResponseEntity.ok().body(studentDatabaseService.getAllStudents());
	}
	
	@GetMapping(path = "/students/{studentId}",produces = "application/json")
	public ResponseEntity<Optional<Student>> getStudentById(@PathVariable("studentId") Integer studentId)
	{
		
		return ResponseEntity.ok().body(studentDatabaseService.getStudentById(studentId));
	}
	
	
	

}
