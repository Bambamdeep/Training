package com.example.person;

public class Person {
int id;
String name;
String location;
public Person() {
	super();
	// TODO Auto-generated constructor stub\
	id =101;
	name ="Deepak";
	location = "patna";
}
public Person(int id, String name, String location) {
	super();
	this.id = id;
	this.name = name;
	this.location = location;
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
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
@Override
public String toString() {
	return "Person [id=" + id + ", name=" + name + ", location=" + location + "]";
}

}
