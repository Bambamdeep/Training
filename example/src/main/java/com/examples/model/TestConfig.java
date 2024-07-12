package com.examples.model;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestConfig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    AnnotationConfigApplicationContext con = new AnnotationConfigApplicationContext (ModelConfigurations.class);
      
    Employee E = con.getBean(Employee.class);
    Employee E1 = con.getBean(Employee.class);
    System.out.println(E);
    Department D = (Department)con.getBean("dept1");
    System.out.println(D);
    Department D1= (Department)con.getBean("dept2");
    System.out.println(D1);
    System.out.println(E.hashCode());
	System.out.println(E1.hashCode());
    
    
    
    
    
    
    
	}

}
