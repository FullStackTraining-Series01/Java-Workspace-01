package com.example.demo.controller;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("error")
@JsonInclude(value = Include.NON_NULL)
public class ErrorObject {

	
	String status;
	
	@JsonProperty("M_Message")
	String message;
	
	@JsonProperty("M_Message2")
	String message2;
	
	
	@JsonIgnore
	String className;
	
	@JsonProperty
	SubError subError;
	
	
	public ErrorObject(String status, String message, String className) {
		super();
		this.status = status;
		this.message = message;
		this.className = className;
		this.subError = new SubError();
		this.message2=null;
	}
	
	public ErrorObject() {
		this.subError = new SubError();
		this.message2=null;
	}

	@JsonGetter("S_Status")
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

	public String getMessage2() {
		return message2;
	}

	public void setMessage2(String message2) {
		this.message2 = message2;
	}

	public SubError getSubError() {
		return subError;
	}

	public void setSubError(SubError subError) {
		this.subError = subError;
	}
	
}
