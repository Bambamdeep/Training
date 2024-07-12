package com.example.handson4.util;

import com.example.handson4.IntValidator;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@Embeddable
public class Address {
	
	@IntValidator
    int door_No;
	@NotEmpty
  String hoseName;
public Address() {
	super();
	// TODO Auto-generated constructor stub
}
public Address(int door_No, String hoseName) {
	super();
	this.door_No = door_No;
	this.hoseName = hoseName;
}
public int getDoor_No() {
	return door_No;
}
public void setDoor_No(int door_No) {
	this.door_No = door_No;
}
public String getHoseName() {
	return hoseName;
}
public void setHoseName(String hoseName) {
	this.hoseName = hoseName;
}
@Override
public String toString() {
	return "Address [door_No=" + door_No + ", hoseName=" + hoseName + "]";
}
  
}
