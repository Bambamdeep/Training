package com.test;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		  List<String> list=new ArrayList<String>();  
//	        list.add("ankit");  
//	        list.add("mayank");  
//	        list.add("irfan");  
//	        list.add("jai");  
//	          
//	        list.forEach(  
//	            (t)->System.out.println(t)    );  
	      List<String> gamesList = new ArrayList<String>();  
	        gamesList.add("Football");  
	        gamesList.add("Cricket");  
	        gamesList.add("Chess");  
	        gamesList.add("Hocky");  
	        System.out.println("------------Iterating by passing lambda expression--------------");  
	        gamesList.forEach((n)-> System.out.println(n));  
	          
	    }  
	} 
