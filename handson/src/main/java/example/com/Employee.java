package example.com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {
 
int empid;
 String name;
 //@Autowired
 Department department;
 
 public Employee() {
	 empid = 2329;
	 name = "DeepakKumar";
 }
 public Employee(int empid, String name, Department department) {
		super();
		this.empid = empid;
		this.name = name;
		this.department = department;
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
public Department getDepartment() {
	return department;
}
public void setDepartment(Department department) {
	this.department = department;
}
@Override
public String toString() {
	return "Employee [empid=" + empid + ", name=" + name + ", department=" + department + "]";
}
 
 
 
 
 
 
 
 
 
 
}
