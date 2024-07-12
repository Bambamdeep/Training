package com.Employee.Employee.Exception;

public class DataIncorrectException extends RuntimeException{
	
  public DataIncorrectException() {
	  super("Entered Data is wrong");
  }
}
