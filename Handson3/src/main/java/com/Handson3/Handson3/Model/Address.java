package com.Handson3.Handson3.Model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
//@Entity
//@Table 
@Embeddable
public class Address {
	
//@Id
int house_no;
int road_no;

public Address() {
	super();
	// TODO Auto-generated constructor stub
}

public Address(int house_no, int road_no) {
	super();
	this.house_no = house_no;
	this.road_no = road_no;
}
public int getHouse_no() {
	return house_no;
}
public void setHouse_no(int house_no) {
	this.house_no = house_no;
}
public int getRoad_no() {
	return road_no;
}
public void setRoad_no(int road_no) {
	this.road_no = road_no;
}
@Override
public String toString() {
	return "Address [house_no=" + house_no + ", road_no=" + road_no + "]";
}

}
