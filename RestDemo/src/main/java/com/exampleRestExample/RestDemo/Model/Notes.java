package com.exampleRestExample.RestDemo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Notes {
	@Id
int pid;
String author;
String title;
String description;
public Notes() {
	super();
	// TODO Auto-generated constructor stub
}
public Notes(int pid, String author, String title, String description) {
	super();
	this.pid = pid;
	this.author = author;
	this.title = title;
	this.description = description;
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
@Override
public String toString() {
	return "Notes [pid=" + pid + ", author=" + author + ", title=" + title + ", description=" + description + "]";
}

}
