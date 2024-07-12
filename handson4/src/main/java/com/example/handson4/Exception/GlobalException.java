package com.example.handson4.Exception;

import java.util.HashMap;

import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {
    
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
   public HashMap<String,String> 
	handlMethodArgumentNotValidExcepton(MethodArgumentNotValidException e){
		HashMap<String,String> map = new HashMap<String,String>();
	e.getBindingResult()
	.getFieldErrors()// it will get the error in the list format 
	.forEach((ex)->{map.put(ex.getField(),ex.getDefaultMessage());
		});
	

		return map;
	}
	@ExceptionHandler(IdNotFoundException.class)
	public String handlIdNotFoundException(IdNotFoundException e) {
		return e.getLocalizedMessage();
	}
	@ExceptionHandler(DataIncorrectException.class)
	public String handlIdNotFoundException(DataIncorrectException e) {
		return e.getLocalizedMessage();
	}
}