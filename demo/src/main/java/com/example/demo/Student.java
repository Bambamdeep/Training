package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Student {
@Id
int id;
String name;
int age;
long ph_no;
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(int id, String name, int age, long ph_no) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
	this.ph_no = ph_no;
}
public int getId() {
	return id;
}
public void setid(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public long getPh_no() {
	return ph_no;
}
public void setPh_no(long ph_no) {
	this.ph_no = ph_no;
}
@Override
public String toString() {
	return "Student [roll_No=" + id + ", name=" + name + ", age=" + age + ", ph_no=" + ph_no + "]";
}


}
