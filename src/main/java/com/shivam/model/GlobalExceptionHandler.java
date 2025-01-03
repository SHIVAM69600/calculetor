package com.shivam.model;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(divideByZeroException.class)
    public ResponseEntity<String> handleDivideByZeroException(divideByZeroException ex) {
		 return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
		 }
}