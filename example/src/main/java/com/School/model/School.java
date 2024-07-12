package com.School.model;

import org.springframework.stereotype.Component;

@Component
class School {
String name;
String program;
public School() {
	super();
	// TODO Auto-generated constructor stub
}
public School(String name, String program) {
	super();
	this.name = name;
	this.program = program;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getProgram() {
	return program;
}
public void setProgram(String program) {
	this.program = program;
}
@Override
public String toString() {
	return "School [name=" + name + ", program=" + program + "]";
}

}
