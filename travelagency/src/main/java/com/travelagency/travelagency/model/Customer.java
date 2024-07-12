package com.travelagency.travelagency.model;

import java.util.List;

import com.travelagency.travelagency.userdefinevalidator.doubleValidate;
import com.travelagency.travelagency.util.CommunicationAddress;
import com.travelagency.travelagency.util.PermanentAddress;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;

import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "Customer_Details")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cId;
	@NotEmpty
	@Size(min = 3, max = 10, message = "firstName should be minimum 3 character and maximum 10")
	private String firstName;
	@NotEmpty
	@Size(min = 3, max = 10, message = "lastName should be minimum 3 character and maximum 10")
	private String lastName;
	@NotEmpty
	@Size(min = 3, max = 20, message = "Minimum character should be 3 and maximun 20")
	private String startingLocation;
	@NotEmpty
	@Size(min = 3, max = 20, message = "Minimum character should be 3 and maximum 20")
	private String destinationLocation;
	@NotEmpty
	private List<String> locationCovered;
	@NotEmpty
	@Size(min = 3, max = 20, message = "Minimum character should be 3 and maximum 20")
	private String packageName;
	@doubleValidate(message = "Amount Should be paid during Booking")
	private double cost;
	@Pattern(regexp = "\\d{10}", message = "Please enter 10 digits")
	private String phone;
	@Embedded
	@Valid
	private PermanentAddress permanentAddress;
	@Embedded
	@Valid
	private CommunicationAddress communicationAddress;
	@NotEmpty
	@Size(min = 3, max = 20, message = "Write your feedback")
	private String notes;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int cId,
			@NotEmpty @Size(min = 3, max = 10, message = "firstName should be minimum 3 character and maximum 10") String firstName,
			@NotEmpty @Size(min = 3, max = 10, message = "lastName should be minimum 3 character and maximum 10") String lastName,
			@NotEmpty @Size(min = 3, max = 20, message = "Minimum character should be 3 and maximun 20") String startingLocation,
			@NotEmpty @Size(min = 3, max = 20, message = "Minimum character should be 3 and maximum 20") String destinationLocation,
			@NotEmpty List<String> locationCovered,
			@NotEmpty @Size(min = 3, max = 20, message = "Minimum character should be 3 and maximum 20") String packageName,
			@doubleValidate(message = "Amount Should be paid during Booking") double cost,
			@Pattern(regexp = "\\d{10}", message = "Please enter 10 digits") String phone,
			@Valid PermanentAddress permanentAddress, @Valid CommunicationAddress communicationAddress,
			@NotEmpty @Size(min = 3, max = 20, message = "Write your feedback") String notes) {
		super();
		this.cId = cId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.startingLocation = startingLocation;
		this.destinationLocation = destinationLocation;
		this.locationCovered = locationCovered;
		this.packageName = packageName;
		this.cost = cost;
		this.phone = phone;
		this.permanentAddress = permanentAddress;
		this.communicationAddress = communicationAddress;
		this.notes = notes;
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getStartingLocation() {
		return startingLocation;
	}

	public void setStartingLocation(String startingLocation) {
		this.startingLocation = startingLocation;
	}

	public String getDestinationLocation() {
		return destinationLocation;
	}

	public void setDestinationLocation(String destinationLocation) {
		this.destinationLocation = destinationLocation;
	}

	public List<String> getLocationCovered() {
		return locationCovered;
	}

	public void setLocationCovered(List<String> locationCovered) {
		this.locationCovered = locationCovered;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public PermanentAddress getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(PermanentAddress permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	public CommunicationAddress getCommunicationAddress() {
		return communicationAddress;
	}

	public void setCommunicationAddress(CommunicationAddress communicationAddress) {
		this.communicationAddress = communicationAddress;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	@Override
	public String toString() {
		return "Customer [cId=" + cId + ", firstName=" + firstName + ", lastName=" + lastName + ", startingLocation="
				+ startingLocation + ", destinationLocation=" + destinationLocation + ", locationCovered="
				+ locationCovered + ", packageName=" + packageName + ", cost=" + cost + ", phone=" + phone
				+ ", permanentAddress=" + permanentAddress + ", communicationAddress=" + communicationAddress
				+ ", notes=" + notes + "]";
	}

}
