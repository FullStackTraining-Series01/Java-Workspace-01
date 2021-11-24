package com.example.demo.showConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController2 {

	@Value("passCode")
	String mypassCode;
	
	@Value("${passCode}")
	String mypassCode2;

	@Autowired
	ConfigFile config;

	
	@GetMapping("/showConfigData")
	private String getByDefaultImplicit() {
		 
		
		return mypassCode;
	}
	
	

	@GetMapping("/showConfigData2")
	private String getByDefaultImplicit2() {
		 
		
		return mypassCode2;
	}
	
	@GetMapping("/showConfigData3")
	private String getByDefaultImplicit3() {
		 
		
		return config.getPassCode();
	}
	
}
