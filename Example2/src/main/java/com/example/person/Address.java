package com.example.person;

public class Address {
int dno;
String housenname;
String place;
public Address() {
	super();
	// TODO Auto-generated constructor stub
	dno =204;
	housenname= "AlokApart";
	place ="Jehanabad";
}
public Address(int dno, String housenname, String place) {
	super();
	this.dno = dno;
	this.housenname = housenname;
	this.place = place;
}
public int getDno() {
	return dno;
}
public void setDno(int dno) {
	this.dno = dno;
}
public String getHousenname() {
	return housenname;
}
public void setHousenname(String housenname) {
	this.housenname = housenname;
}
public String getPlace() {
	return place;
}
public void setPlace(String place) {
	this.place = place;
}
@Override
public String toString() {
	return "Address [dno=" + dno + ", housenname=" + housenname + ", place=" + place + "]";
}

}
