package com.example.demo.showValidations;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController3 {

	
	
	@PostMapping("/user")
	private String doSomething(@Valid @RequestBody UserVO user) {
		
		
		
		return "success";
	}
	
}
