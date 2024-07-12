package com.example.Handson1.Exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(StudentNotFound.class)
	public String StudentNotFoundWithID(StudentNotFound e) {
		return e.getMessage();
	}
	 @ExceptionHandler(DataIncorrect.class)
	public String handleDataIncorrect(DataIncorrect t) {
		 return t.getMessage();
	 }

}