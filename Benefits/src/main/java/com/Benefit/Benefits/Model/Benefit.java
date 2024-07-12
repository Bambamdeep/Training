package com.Benefit.Benefits.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Benefit {
	@Id
	int benefit_Id;
	String healthInsurence;
	String retirement_Plan;
	int empid;
	public Benefit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Benefit(int benefit_Id, String healthInsurence, String retirement_Plan, int empid) {
		super();
		this.benefit_Id = benefit_Id;
		this.healthInsurence = healthInsurence;
		this.retirement_Plan = retirement_Plan;
		this.empid = empid;
	}
	public int getBenefit_Id() {
		return benefit_Id;
	}
	public void setBenefit_Id(int benefit_Id) {
		this.benefit_Id = benefit_Id;
	}
	public String getHealthInsurence() {
		return healthInsurence;
	}
	public void setHealthInsurence(String healthInsurence) {
		this.healthInsurence = healthInsurence;
	}
	public String getRetirement_Plan() {
		return retirement_Plan;
	}
	public void setRetirement_Plan(String retirement_Plan) {
		this.retirement_Plan = retirement_Plan;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	@Override
	public String toString() {
		return "Benefit [benefit_Id=" + benefit_Id + ", healthInsurence=" + healthInsurence + ", retirement_Plan="
				+ retirement_Plan + ", empid=" + empid + "]";
	}
	
 
}
