package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.vo.Student;

@RestController
public class CourseController {

	@Autowired
	CourseService myservice;
	
	@GetMapping("/mycourse")
	public Student getCourse(){
		
		
		Student student1 = new Student();
		student1.setName("Ajay");
		student1.setTechnology("Java");
		student1.setIndustry("IT");
		
		myservice.insertStudentDetails(student1);
		
		return student1;
		
	}	
}
