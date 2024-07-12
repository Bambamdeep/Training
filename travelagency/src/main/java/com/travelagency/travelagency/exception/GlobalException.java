package com.travelagency.travelagency.exception;

import java.util.HashMap;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;



@RestControllerAdvice
public class GlobalException {
	@ExceptionHandler(IdNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public String handleIdNotFoundException(IdNotFoundException e) {
		return e.getMessage();
	}
	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	 public HashMap<String,String>
	               handlMethodArgumentNotValidException(MethodArgumentNotValidException e){
		 HashMap<String , String > map = new HashMap<String,String>();
		 e.getBindingResult()
		 .getFieldErrors()
		 .forEach((ex)->{map.put(ex.getField(), ex.getDefaultMessage());
		 });
		 return map;
	 }

}
