package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService service;
	
	
	@GetMapping(path = "/student")
	 public StudentVO getStudent(@RequestParam(name = "name") String name1) {
		System.out.println("name ="+name1);
		return service.getStudent(name1);

	}
	@PostMapping(path = "/student")
	 public StudentVO getStudent3(@RequestParam(name = "name") String name1) {
		System.out.println("name ="+name1);
		return null;

	}
	
	
	@PostMapping(path = "/student/{rollnum}")
	 public StudentVO getStudent2(@RequestParam(name = "name") String name1, @PathVariable(name="rollnum") String rollnum  ) {
		System.out.println("POST name ="+name1);
		System.out.println("POST rollnum ="+rollnum);
		return null;

	}
	@GetMapping(path = "/student/{rollnum}")
	 public StudentVO getStudent4(@RequestParam(name = "name") String name1, @PathVariable(name="rollnum") String rollnum  ) {
		System.out.println("GET name ="+name1);
		System.out.println("GET rollnum ="+rollnum);
		return null;

	}
	
	@PostMapping(path = "/student/{rollnum}/V2")
	 public StudentVO getStudent5(
			 @RequestParam(name = "name") String name1, 
			 @PathVariable(name="rollnum") String rollnum,  
			 @RequestBody StudentVO student) {
		System.out.println("POST name ="+name1);
		System.out.println("POST rollnum ="+rollnum);
		System.out.println("POST student ="+student);
		System.out.println("POST student ="+student.getName());
		
		
	
		return service.getStudent5(name1, rollnum, student);

	}
	
	
	
	@PutMapping(path = "/student/{rollnum}/V2")
	 public StudentVO getStudent55(
			 @RequestParam(name = "name") String name1, 
			 @PathVariable(name="rollnum") String rollnum,  
			 @RequestBody StudentVO student) {
		System.out.println("POST name ="+name1);
		System.out.println("POST rollnum ="+rollnum);
		System.out.println("POST student ="+student);
		System.out.println("POST student ="+student.getName());
		
		
	
		return service.getStudent5(name1, rollnum, student);

	}
	
	@DeleteMapping(path = "/student")
	 public StudentVO getStudent77(@RequestParam(name = "name") String name1) {
		System.out.println("name ="+name1);
		return service.getStudent40(name1);

	}
	
}
