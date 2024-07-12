package com.School.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("org")
public class Organization {
	int orgId;
	String orgName;
	@Autowired
	School school;
	public Organization() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Organization(int orgId, String orgName, School school) {
		super();
		this.orgId = orgId;
		this.orgName = orgName;
		this.school = school;
	}
	public int getOrgId() {
		return orgId;
	}
	public void setOrgId(int orgId) {
		this.orgId = orgId;
	}
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public School getSchool() {
		return school;
	}
	public void setSchool(School school) {
		this.school = school;
	}
	@Override
	public String toString() {
		return "Organization [orgId=" + orgId + ", orgName=" + orgName + ", school=" + school + "]";
	}


	

}
