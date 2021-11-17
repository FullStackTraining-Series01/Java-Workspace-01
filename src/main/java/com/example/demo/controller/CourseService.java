package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.vo.Student;

@Service
public class CourseService {
	
	@Autowired
    CourseDAO myPersistanceLayer;
	
	public String insertStudentDetails(Student student) {
		
		System.out.println("in service class - student object"+student);
		System.out.println("in service class - student name"+student.getName());
		
		
		myPersistanceLayer.insertStudentDetails(student);
		
		return "success";
	}
}
