package com.ProjectExample.ProjectExample;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Student {
	@Id
  int roll;
  String Name;
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(int roll, String name) {
	super();
	this.roll = roll;
	Name = name;
}

public int getRoll() {
	return roll;
}
public void setRoll(int roll) {
	this.roll = roll;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
@Override
public String toString() {
	return "Student [roll=" + roll + ", Name=" + Name + "]";
}
  
}
