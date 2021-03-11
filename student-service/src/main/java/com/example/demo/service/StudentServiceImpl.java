package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
@Service
public class StudentServiceImpl implements StudentService {
	
	private List<Student> students=null;
	
	{
		students=new ArrayList<Student>();
		students.add(new Student(1, "John", "Doe", "john@email.com"));
		students.add(new Student(2, "Marry", "Public", "marry@email.com"));
		students.add(new Student(3, "Rahul", "Dravid", "rahul@email.com"));
		students.add(new Student(4, "Cris", "Gayl", "cris@email.com"));
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return students;
	}

	@Override
	public Student getStudentById(Integer studentId) {
		// TODO Auto-generated method stub
		Student student=null;
		for(Student s:students)
		{
			if(s.getStudentId()==studentId)
			{
				student=s;
				
			}
		}
		return student;
	}

}
