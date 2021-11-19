package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class MyControllerAdvice {

	@ExceptionHandler(MissingServletRequestParameterException.class)
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	public ErrorObject handleBadRequest(MissingServletRequestParameterException e) {
		ErrorObject err = new ErrorObject();
		err.setClassName("MyExceptionOn17Nov");
		err.setMessage(e.getMessage());
		err.setStatus("200");
		
		return err;

	}
}
