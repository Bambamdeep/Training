package com.example.Handson1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Handson1.Model.Student;
import com.example.Handson1.Service.StudentService;

@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
   @Autowired 
   StudentService service;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Student s = new Student(1,"johan Smith",10,'A',"Lincoln high school",123);
		Student s1 = new Student(2,"Emily jhonsinn",8,'B',"dav high school",1234);
		Student s2 = new Student(3," Smith",11,'c',"abc high school",12345);
		Student s3 = new Student(4,"johan",12,'D',"def high school",111);
		Student s4 = new Student(5," steve Smith",9,'A',"ghi high school",12341);
		Student s5 = new Student(6," steve",10,'G',"jkl high school",113);
		Student s6 = new Student(7,"johanson ",7,'K',"xyz high school",1233);
		Student s7 = new Student(8,"michel",6,'L',"ABC high school",123222);
		Student s8 = new Student(9,"ponting",5,'a',"XYZABC high school",12353);
		Student s9 = new Student(10,"Dravid",3,'M',"SSSSSSSS high school",111123);
		Student s10 = new Student(11,"Dhoni",10,'H',"ranchi high school",2222);
		service.addStudent(s);
		service.addStudent(s1);
		service.addStudent(s2);
		service.addStudent(s3);
		service.addStudent(s4);
		service.addStudent(s5);
		service.addStudent(s6);
		service.addStudent(s7);
		service.addStudent(s8);
		service.addStudent(s9);
		service.addStudent(s10);
		service.addStudent(s);
		
		
		
		
		
		
	}

}
