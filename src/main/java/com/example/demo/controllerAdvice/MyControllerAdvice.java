package com.example.demo.controllerAdvice;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class MyControllerAdvice {
	
	@ExceptionHandler(value = { NullPointerException.class})
	public String handleMyException() {
		System.out.println("in my Exception Handler");
		return "I handled it From COntroller Advice";
	}
	
	@ExceptionHandler(value = { ArrayIndexOutOfBoundsException.class})
	public String handleMyException2() {
		System.out.println("in my Exception Handler");
		return "I handled it From COntroller Advice";
	}
	
}
