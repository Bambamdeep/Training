package com.ProjectExample2.ProjectExample2;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Result {
	@Id
	int rid;
	int rollno;
	String subject;
	public Result() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Result(int rid, int rollno, String subject) {
		super();
		this.rid = rid;
		this.rollno = rollno;
		this.subject = subject;
	}
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Result [rid=" + rid + ", rollno=" + rollno + ", subject=" + subject + "]";
	}
	

}
