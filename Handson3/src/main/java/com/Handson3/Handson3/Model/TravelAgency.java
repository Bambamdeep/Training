package com.Handson3.Handson3.Model;


import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class TravelAgency {
@Id
int id;
String name;
List<String>  locationCovered;
//@OneToOne(cascade = CascadeType.ALL)
//@JoinColumn(name = "house_no")
@Embedded
public Address addres;
public  TravelAgency() {
	super();
	// TODO Auto-generated constructor stub
}
public TravelAgency(int id, String name, List<String> locationCovered, Address addres) {
	super();
	this.id = id;
	this.name = name;
	this.locationCovered = locationCovered;
	this.addres = addres;
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
public List<String> getLocationCovered() {
	return locationCovered;
}
public void setLocationCovered(List<String> locationCovered) {
	this.locationCovered = locationCovered;
}
public Address getAddres() {
	return addres;
}
public void setAddres(Address addres) {
	this.addres = addres;
}
@Override
public String toString() {
	return "TravelAgency [id=" + id + ", name=" + name + ", locationCovered=" + locationCovered + ", addres=" + addres
			+ "]";
}

	
}






