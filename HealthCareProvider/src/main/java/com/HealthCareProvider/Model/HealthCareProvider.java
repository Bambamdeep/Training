package com.HealthCareProvider.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "HealthCareProvider_Detail")
public class HealthCareProvider {
	@Id
	int provider_Id;
	String provider_Name;
	String doctor;
	String hospital;
	String insurence_Accepted;
	int empid;
	public HealthCareProvider() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HealthCareProvider(int provider_Id, String provider_Name, String doctor, String hospital,
			String insurence_Accepted, int empid) {
		super();
		this.provider_Id = provider_Id;
		this.provider_Name = provider_Name;
		this.doctor = doctor;
		this.hospital = hospital;
		this.insurence_Accepted = insurence_Accepted;
		this.empid = empid;
	}
	public int getProvider_Id() {
		return provider_Id;
	}
	public void setProvider_Id(int provider_Id) {
		this.provider_Id = provider_Id;
	}
	public String getProvider_Name() {
		return provider_Name;
	}
	public void setProvider_Name(String provider_Name) {
		this.provider_Name = provider_Name;
	}
	public String getDoctor() {
		return doctor;
	}
	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}
	public String getHospital() {
		return hospital;
	}
	public void setHospital(String hospital) {
		this.hospital = hospital;
	}
	public String getInsurence_Accepted() {
		return insurence_Accepted;
	}
	public void setInsurence_Accepted(String insurence_Accepted) {
		this.insurence_Accepted = insurence_Accepted;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	@Override
	public String toString() {
		return "HealthCareProvider [provider_Id=" + provider_Id + ", provider_Name=" + provider_Name + ", doctor="
				+ doctor + ", hospital=" + hospital + ", insurence_Accepted=" + insurence_Accepted + ", empid=" + empid
				+ "]";
	}
	

}
