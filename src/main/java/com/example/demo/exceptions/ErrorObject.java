package com.example.demo.exceptions;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ErrorObject {

	@JsonProperty
	String status;
	@JsonProperty
	String message;
	@JsonProperty
	String className;
	
	
	public ErrorObject(String status, String message, String className) {
		super();
		this.status = status;
		this.message = message;
		this.className = className;
	}
	
	public ErrorObject() {
		// TODO Auto-generated constructor stub
	}

	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	
}
