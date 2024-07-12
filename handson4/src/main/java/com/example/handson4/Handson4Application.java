package com.example.handson4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.handson4.Service.StudentService;
import com.example.handson4.model.Student;
import com.example.handson4.util.Address;

@SpringBootApplication
public class Handson4Application implements CommandLineRunner{
@Autowired
StudentService service;
	public static void main(String[] args) {
		SpringApplication.run(Handson4Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Address a = new Address(12,"12B");
	 Student s = new Student (1,"DEEPAK","Kumar",800.0,a);
	 Student s1 = new Student (2,"DEEPAK","Kumar",80020287824.0,a);
		service.add(s);
		service.add(s1);
		
	}

}
