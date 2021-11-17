package com.example.demo.controllerAdvice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.demo.exceptions.ErrorObject;
import com.example.demo.exceptions.MyExceptionOn17Nov;
import com.example.demo.exceptions.MyExceptionOn17Nov2;

@RestControllerAdvice
public class ControllerAdvice17Nov {

//	@ExceptionHandler(value = {MyExceptionOn17Nov.class, Exception.class})
//	public String handlException17Nov(MyExceptionOn17Nov myException , Exception e) {
//		
//		System.out.println(e.getMessage());
//		
//		return myException.getMessage();
//	}
	
	@ExceptionHandler(value = {MyExceptionOn17Nov.class})
	public ResponseEntity<ErrorObject> handlException17Nov(MyExceptionOn17Nov myException) {
		
		ErrorObject err = new ErrorObject();
		err.setClassName("MyExceptionOn17Nov");
		err.setMessage(myException.getMessage());
		err.setStatus("200");
		
		return new ResponseEntity<ErrorObject>(err, HttpStatus.NOT_IMPLEMENTED);
		
		//return err;
		
		//return  myException.getMessage();
	}
	
	@ExceptionHandler(value = {MyExceptionOn17Nov2.class})
	@ResponseStatus(value=HttpStatus.OK)
	public ErrorObject handlException17NovV2(MyExceptionOn17Nov2 myException) {
		
		ErrorObject err = new ErrorObject();
		err.setClassName("MyExceptionOn17Nov");
		err.setMessage(myException.getMessage());
		err.setStatus("200");
		
		//return new ResponseEntity<ErrorObject>(err, HttpStatus.NOT_IMPLEMENTED);
		
		return err;
		
		//return  myException.getMessage();
	}
}
