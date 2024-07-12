package com.RestDemo.RestDemoExample.Model;
public class Student {
	
int pid;
String name;
String address;
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(int pid, String name, String address) {
	super();
	this.pid = pid;
	this.name = name;
	this.address = address;
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
@Override
public String toString() {
	return "Student [pid=" + pid + ", name=" + name + ", address=" + address + "]";
}


}
