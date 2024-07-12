package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{
@Autowired
StudentService service;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Student s1 = new Student (1,"Deepak",23,1234567);
		Student s2 = new Student (2,"Bambam",22,1237);
		Student s3 = new Student (3,"Deepa",21,1234567);
		Student s4 = new Student (4,"Aditi",20,900406789);
		Student s5 = new Student (5,"Ishu",19,800208784);
		Student s6 = new Student (6,"Ladoo",18,896954635);
		Student s7 = new Student (7,"Rita",17,933460024);
		Student s8 = new Student (8,"Narendra",16,987654321);
		
		service.addRecord(s1);
		service.addRecord(s2);
		service.addRecord(s3);
		service.addRecord(s4);
		service.addRecord(s5);
		service.addRecord(s6);
		service.addRecord(s7);
		service.addRecord(s8);
	//System.out.println	(service.getRecordById(5));
         // service.deletestudent(6);
		
 // service.getAllRecord().forEach(System.out::println);
  System.out.println("after ");
  service.findByIdGreaterThan(3).forEach(System.out::println);
		
	}

}
