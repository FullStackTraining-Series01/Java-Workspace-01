package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.vo.Student;

@Service
public class CourseService {

	@Autowired
	CourseDAO myPersistenceLayer;
	
	public String insertStudentDetails(Student student){
		
		System.out.println("in service class - student object"+student);
		System.out.println("in service class - student name"+student.getName());
		
		myPersistenceLayer.insertStudentDetails(student);
		
		return "success";
	}

	public Student getStudent() {
		
		Student student1= myPersistenceLayer.getStudent();
		return student1;
		
	}
	
public Student getStudent(String name) {
		
		Student student1= myPersistenceLayer.getStudent(name);
		return student1;
		
	}
}
