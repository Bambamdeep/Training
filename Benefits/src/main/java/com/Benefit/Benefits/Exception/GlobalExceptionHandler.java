package com.Benefit.Benefits.Exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ExceptionHandler(BenefitIDNotFound.class)
	public String handlBenefitIDNotFoundException(BenefitIDNotFound e) {
		return e.getMessage();
	}

}
