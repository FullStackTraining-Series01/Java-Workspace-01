package com.example.demo;

import java.io.IOException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exceptions.MyExceptionOn17Nov;
import com.example.demo.exceptions.MyExceptionOn17Nov2;
import com.example.demo.vo.LambokTry;

@RestController
public class MyController2 {

	
	@GetMapping("exception17NovV2")
	public void myExceptionMethod17Nov() throws MyExceptionOn17Nov, Exception {
		System.out.println("inside my exception17Nov ");
		throw new MyExceptionOn17Nov2("My Exception messge 17Nov - MyController2");
	}
	

	@GetMapping("myLambok")
	public LambokTry getProperties() throws IOException {
		
		System.out.println("123");
		
//		System.in.read();
		System.err.println("123");
		
		LambokTry mytry = new LambokTry();
//		
//		mytry.setName("ABC");
//		mytry.getName();
		
		return  mytry;

	}

}
