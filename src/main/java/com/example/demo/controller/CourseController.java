package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.vo.Student;

@RestController
public class CourseController {

	@Autowired
	CourseService myservice;
	
	@GetMapping("/mycourse/{name}")
	public Student getCourse(@PathVariable String name){
		
		System.out.println(name);
		Student student1= myservice.getStudent(name);
		
		//myservice.insertStudentDetails(student1);
		
		return student1;
		
	}	
	@GetMapping("/mycourse")
	public Student getCourse2(@RequestParam(name= "name") String name){
		
		System.out.println(name);
		Student student1= myservice.getStudent(name);
		
		//myservice.insertStudentDetails(student1);
		
		return student1;
		
	}	
	
		
	@PostMapping("/mycourse")
	public Student insertCourse(@RequestBody Student student1){
		
		System.out.println("Student"+ student1);
		myservice.insertStudentDetails(student1);
		
		return student1;
		
	}	
}
