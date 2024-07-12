package com.School.model;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class Student {
int id ;
String name ;
String subject ;

public Student() {
	
}

public Student(int id, String name, String subject) {
	super();
	this.id = id;
	this.name = name;
	this.subject = subject;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getSubject() {
	return subject;
}

public void setSubject(String subject) {
	this.subject = subject;
}

@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", subject=" + subject + "]";
}
@PostConstruct
public void initMethod() {
	System.out.println("Student object is initialized");
}
}