package com.example.demo;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exceptions.MyExceptionOn17Nov;

@RestController
public class MyController {

	@GetMapping("exception1")
	public String myexception1() {
		System.out.println("in my exception");
		return "success";
	}
	

	@GetMapping("exception2")
	public void myexception2() throws Exception {
		System.out.println("in my exception");
		
		
		throw new Exception();
		
	}
	
	@GetMapping("exception17Nov")
	public void myExceptionMethod17Nov() throws MyExceptionOn17Nov {
		System.out.println("inside my exception17Nov ");
		throw new MyExceptionOn17Nov("My Exception messge 17Nov");
	}
	
//	@ExceptionHandler(MyExceptionOn17Nov.class)
//	public String handlException17Nov() {
//		return "caught";
//	}
	
//	@ExceptionHandler(value = { NullPointerException.class, Exception.class})
//	public String handleMyException() {
//		System.out.println("in my Exception Handler");
//		return "I handled it";
//	}
//	
	/***
	 * Catch Block --> Limited to a method or API
	 * @ExceptionHandler --> Limited to a Controller
	 */
	
}
