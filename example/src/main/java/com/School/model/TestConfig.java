package com.School.model;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestConfig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AnnotationConfigApplicationContext con = new AnnotationConfigApplicationContext(Config.class);
  

   Student s = con.getBean(Student.class);
   System.out.println(s);
   School s1 = con.getBean(School.class);
   System.out.println(s1);
   
   Organization o = con.getBean(Organization.class);
   System.out.println(o);
   



	}

}
