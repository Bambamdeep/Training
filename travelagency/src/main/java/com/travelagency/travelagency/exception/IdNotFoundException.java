package com.travelagency.travelagency.exception;

public class IdNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String meassage;
	
	public IdNotFoundException(String message) {
		super(message);
		this.meassage=message;
	}

}
