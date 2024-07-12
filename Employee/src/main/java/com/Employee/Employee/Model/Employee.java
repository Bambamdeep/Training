package com.Employee.Employee.Model;
import java.util.ArrayList;
import java.util.List;
import com.Benefit.Benefits.Model.Benefit;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
// One employee can take Many benefit
public class Employee {
	@Id
	int empid;
	String name;
	int phone_no;
	String dept;
	String gender;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empid, String name, int phone_no, String dept, String gender) {
		super();
		this.empid = empid;
		this.name = name;
		this.phone_no = phone_no;
		this.dept = dept;
		this.gender = gender;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(int phone_no) {
		this.phone_no = phone_no;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", phone_no=" + phone_no + ", dept=" + dept + ", gender="
				+ gender + "]";
	}

}
