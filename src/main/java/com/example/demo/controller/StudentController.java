package com.example.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	
//	@GetMapping(path = "/error")
//	public String myerror() {
//		return "noError";
//
//	}
	
	@GetMapping(path = "/student1")
	//public ResponseEntity<StudentVO> getStudent() {
	public ResponseEntity<String> getStudent() {
		
		//ResponseEntity
		

		StudentVO student=  new StudentVO();
		student.setName("ABC");
		
		//ResponseEntity<StudentVO> responseObject = new ResponseEntity<StudentVO>(student,HttpStatus.NOT_FOUND);
		
		ResponseEntity<String> responseObject = new ResponseEntity<String>("Ajay",HttpStatus.NOT_FOUND);
		
		return responseObject;
		
		//return "Ajay";

	}
	

	@GetMapping(path = "/if1send1")
		public ResponseEntity<String> ifOneSendONe(@RequestParam(name = "value", required=false, defaultValue = "1") Integer value) {
		
		
		String name = null;
		
		if(value==2) {
			name = "Ajay-Developer";
		} else if(value==3) {
			name = "Ajay-Leaner";
		} else if(value==6) {
			name = "Ajay-Leaner2";
		} else {
			name = "Ajay-Trainer";
		}
		
		//Switch
		
		ResponseEntity<String> responseObject = new ResponseEntity<String>(name,HttpStatus.NOT_FOUND);
		
		return responseObject;
	
	}
	
	@GetMapping("/myset")
	private void mySet() {
		
		List<Integer> myList = new ArrayList<>();
		myList.add(1);
		myList.add(2);
		myList.add(1);
		
		//myList.add("Ajay");
		System.out.println("my List "+myList);
		
		Set<String> myset = new HashSet<>();
		myset.add("ABC");
		myset.add("DEF");
		myset.add("ABC");
		System.out.println("myset "+ myset);
		
		Map<Integer,String> myMap = new HashMap<>();
		myMap.put(1,"ABC");
		myMap.put(2,"ABC");
		myMap.put(3,"DEf");
		myMap.put(1,"DEF");
		System.out.println("myMap "+ myMap);
	}
	
	
	
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
	
	@DeleteMapping(path="/student/all")
	public void deleteAll() {
		service.deleteAllStudents();
	

	}
	@GetMapping(path="/student/all")
	public List<StudentVO> finallAll() {
		return service.getAllStudents();
	

	}
}
