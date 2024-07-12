package com.example.Handson1.Exception;

public class StudentNotFound extends RuntimeException{
String msg;
	public StudentNotFound(String msg){
		super(msg);
		this.msg = msg;
		

}
	
}