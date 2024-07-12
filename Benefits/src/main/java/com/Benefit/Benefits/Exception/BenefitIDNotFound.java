package com.Benefit.Benefits.Exception;

public class BenefitIDNotFound extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String message;
	
public BenefitIDNotFound (String message) {
	super(message);
	this.message = message;
	
}

}
