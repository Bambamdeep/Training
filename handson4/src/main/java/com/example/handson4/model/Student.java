package com.example.handson4.model;

import com.example.handson4.doubleValidate;
import com.example.handson4.util.Address;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;


@Entity
@Table

public class Student {
@Id
int id;
@NotEmpty
@Size(min = 3, message = "minimum 3 character")
String fName;         // only name  is there so we can chnged to get some differt;
@NotEmpty
@Size(min = 3, message = "minimum 3 character")
String lName;
//@Pattern(regexp = "\\d{10}")
@doubleValidate
Double  phone;

@Embedded
@Valid
public Address addres;

public Student() {
	super();
	// TODO Auto-generated constructor stub
}

public Student(@NotNull(message = "it Should not be null") int id,
		@NotEmpty @Size(min = 3, message = "minimum 3 character") String fName,
		@NotEmpty @Size(min = 3, message = "minimum 3 character") String lName,
		@Pattern(regexp = "\\d{10}", message = "please Enter 10 digit") Double phone, @Valid Address addres) {
	super();
	this.id = id;
	this.fName = fName;
	this.lName = lName;
	this.phone = phone;
	this.addres = addres;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getfName() {
	return fName;
}

public void setfName(String fName) {
	this.fName = fName;
}

public String getlName() {
	return lName;
}

public void setlName(String lName) {
	this.lName = lName;
}

public Double getPhone() {
	return phone;
}

public void setPhone(Double phone) {
	this.phone = phone;
}

public Address getAddres() {
	return addres;
}

public void setAddres(Address addres) {
	this.addres = addres;
}

@Override
public String toString() {
	return "Student [id=" + id + ", fName=" + fName + ", lName=" + lName + ", number=" + phone + ", addres=" + addres
			+ "]";
}




}
