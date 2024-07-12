package com.travelagency.travelagency.util;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Embeddable
public class PermanentAddress {
	@NotEmpty(message = "House_No should not be  empty")
	private String House_No;
	@NotEmpty
	@Size(min = 3, max = 20, message = "It should be Minimum 3 character and max 20")
	private String Street;
	@NotEmpty
	@Size(min = 3, max = 20, message = "It should be Minimum 3 character and max 20")
	private String Landmark;
	@NotEmpty
	@Size(min = 3, max = 20, message = "It should be Minimum 3 character and maximum 20")
	private String city;
	@NotEmpty
	@Size(min = 3, max = 20, message = "It should be Minimum 3 character and maximum 20")
	private String State;
	@NotNull(message = "pin code Sholud be Valid")
	private int pin;

	public PermanentAddress() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PermanentAddress(@NotEmpty(message = "House_No should not be  empty") String house_No,
			@NotEmpty @Size(min = 3, max = 20, message = "It should be Minimum 3 character and max 20") String street,
			@NotEmpty @Size(min = 3, max = 20, message = "It should be Minimum 3 character and max 20") String landmark,
			@NotEmpty @Size(min = 3, max = 20, message = "It should be Minimum 3 character and maximum 20") String city,
			@NotEmpty @Size(min = 3, max = 20, message = "It should be Minimum 3 character and maximum 20") String state,
			@NotNull(message = "pin code Sholud be Valid") int pin) {
		super();
		House_No = house_No;
		Street = street;
		Landmark = landmark;
		this.city = city;
		State = state;
		this.pin = pin;
	}

	public String getHouse_No() {
		return House_No;
	}

	public void setHouse_No(String house_No) {
		House_No = house_No;
	}

	public String getStreet() {
		return Street;
	}

	public void setStreet(String street) {
		Street = street;
	}

	public String getLandmark() {
		return Landmark;
	}

	public void setLandmark(String landmark) {
		Landmark = landmark;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "PermanentAddress [House_No=" + House_No + ", Street=" + Street + ", Landmark=" + Landmark + ", city="
				+ city + ", State=" + State + ", pin=" + pin + "]";
	}

}
