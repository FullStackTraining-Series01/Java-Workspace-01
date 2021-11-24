package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@Autowired
	MyService service;
	
	
	@GetMapping("/student")
	private StudentVO getByDefaultImplicit(@RequestParam String rollNum) {
		
		StudentVO student= service.getByDefaultImplicit(rollNum);

		return student;
	}
	
}
