package com.example.Handson1.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Student_Details")
public class Student {
	@Id
int sId;
String name ;
int standard;
char section;
String schoolName;
long phone;
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(int sId, String name, int standard, char section, String schoolName, long phone) {
	super();
	this.sId = sId;
	this.name = name;
	this.standard = standard;
	this.section = section;
	this.schoolName = schoolName;
	this.phone = phone;
}
public int getsId() {
	return sId;
}
public void setsId(int sId) {
	this.sId = sId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getStandard() {
	return standard;
}
public void setStandard(int standard) {
	this.standard = standard;
}
public char getSection() {
	return section;
}
public void setSection(char section) {
	this.section = section;
}
public String getSchoolName() {
	return schoolName;
}
public void setSchoolName(String schoolName) {
	this.schoolName = schoolName;
}
public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
}
@Override
public String toString() {
	return "Student [sId=" + sId + ", name=" + name + ", standard=" + standard + ", section=" + section
			+ ", schoolName=" + schoolName + ", phone=" + phone + "]";
}

}
