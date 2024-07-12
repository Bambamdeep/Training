package com.example.handson4.Exception;

public class DataIncorrectException extends RuntimeException{
	String message;
	
public DataIncorrectException(String message) {
super(message);
this.message = message;

}
}