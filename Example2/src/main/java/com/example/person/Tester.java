package com.example.person;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  AnnotationConfigApplicationContext con = new AnnotationConfigApplicationContext(Config.class);
  
       Person p =(Person)con.getBean(Person.class);
       System.out.println(p);
       Address a =(Address)con.getBean(Address.class);
       System.out.println(a);
	}

}
