package com.exception;

import java.util.Scanner;
// custom exception
public class ExceptionDemo extends Exception {
	public ExceptionDemo () {
		super("WORNG INPUT");
	}
	public static void main (String[] args) throws ExceptionDemo {
		//it will give Airthmetic Error
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of A:");
		int a  = sc.nextInt();
		
	  	int b=0;
		int d =10;
		int c ;
		int f;
		// catch block only come with try block it will not come without try block
		// Try will not come without catch block .
		// you can also wirte as many number of Catch block for only one try block
		 
//			if (a<=9) {
//				try {
//					
//					throw new ExceptionDemo();
//				}
//			   catch (Exception e){
//				  System.out.println(e);
//				   
//			   }
//				
//			}
//			else {
//				System.out.println("NO Error in the above program");
		if (a==10) {
			throw new ExceptionDemo();
		}
		
//			}		
// we have as many number of try block but only one catch block for all the try block to catch the exception
//		
		try {
			
		}
//		catch (Exception e) {
//	    System.out.println(e);
//		}
//		
		//wheather the exception is handle of not finally would called
		finally {
		System.out.println("Finally block is called");
		}
		
	}
}