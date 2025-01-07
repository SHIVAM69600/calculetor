package com.shivam.service;

import org.springframework.stereotype.Service;

import com.shivam.model.divideByZeroException;

@Service
public  class CLService implements calcuservice {
  
	public double calculate(double a, double b, String operation) {
		switch (operation.toLowerCase()) { 
			case "multiply":
			return a * b; 

			case "divide":
			return a / b; 
	   
			case "add":
			return a+b;
		
			case  "sub":
			return a-b;
			
			case "madulo":
			return a%b;
			
			case "sin":
			return Math.sin(Math.toRadians(a));  
			
			case "cos":
			return Math.cos(Math.toRadians(a));

	}
		return b;
}

	public double add(double a, double b) {
		 return a+b;
	}
	@Override
	public double sub(double a, double b) {
		
		return a-b;
	}

	@Override
	public double divide(double a, double b) {
	
		 if (b == 0) { // Check for division by zero
		        throw new divideByZeroException("Division by zero is not allowed");
		    }
		    return a / b; // Perform division if no error
		}

	
}

