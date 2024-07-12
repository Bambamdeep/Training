package com.handson2.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "emp_Details")
public class Employee {
  @Id
  int empid;
  String ename;
  String position;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(int empid, String ename, String position) {
	super();
	this.empid = empid;
	this.ename = ename;
	this.position = position;
}
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public String getPosition() {
	return position;
}
public void setPosition(String position) {
	this.position = position;
}
@Override
public String toString() {
	return "Employee [empid=" + empid + ", ename=" + ename + ", position=" + position + "]";
}
  
}
