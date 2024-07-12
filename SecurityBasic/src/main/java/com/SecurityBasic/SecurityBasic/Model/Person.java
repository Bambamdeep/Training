package com.SecurityBasic.SecurityBasic.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "person_details")
public class Person {
	@Id
    int adharId;
    String name;
    String fatherName;
    String address;
    int phone_no;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int adharId, String name, String fatherName, String address, int phone_no) {
		super();
		this.adharId = adharId;
		this.name = name;
		this.fatherName = fatherName;
		this.address = address;
		this.phone_no = phone_no;
	}
	public int getAdharId() {
		return adharId;
	}
	public void setAdharId(int adharId) {
		this.adharId = adharId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(int phone_no) {
		this.phone_no = phone_no;
	}
	@Override
	public String toString() {
		return "Person [adharId=" + adharId + ", name=" + name + ", fatherName=" + fatherName + ", address=" + address
				+ ", phone_no=" + phone_no + "]";
	}
    
	
	
	
}
