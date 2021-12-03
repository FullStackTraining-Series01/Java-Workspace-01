package com.example.demo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class MyController {
	
	Logger logger = LoggerFactory.getLogger(getClass());

	@GetMapping("/user/name")
	public MyPojo getusernmae() {
	
		MyPojo pojo = new MyPojo();
		pojo.setName("Ajay Developer");
		
		return pojo;
	}
	
	@PostMapping("/user/name")
	public MyPojo postusernmae(@RequestBody MyPojo pojo) {
	
		logger.info(pojo.getName());
		
		return pojo;
	}
}
