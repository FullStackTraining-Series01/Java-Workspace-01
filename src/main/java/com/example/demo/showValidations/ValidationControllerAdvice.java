package com.example.demo.showValidations;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ValidationControllerAdvice {

	Logger logger = Logger.getAnonymousLogger();
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	private ResponseEntity<Map> handleValidations(MethodArgumentNotValidException e) {
		logger.info(e.getMessage());
		

        Map<String, Object> exceptionResponseMap = new LinkedHashMap<>();
        exceptionResponseMap.put("message", "Validation errors found in the input request.");
        
		
		List<String> errors = e.getBindingResult()
                .getFieldErrors()
                .stream()
                .map(x -> x.getDefaultMessage())
                .collect(Collectors.toList());
		
		logger.info(errors.get(0));
		
		exceptionResponseMap.put("errors", errors);
		
        exceptionResponseMap.put("status", HttpStatus.BAD_REQUEST.value());
        exceptionResponseMap.put("timestamp", new Date());
        
		return new ResponseEntity<>(exceptionResponseMap,HttpStatus.BAD_REQUEST );
	}
}
