package com.travelagency.travelagency.util;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Embeddable
public class CommunicationAddress {
	@NotEmpty(message = "flat_No should not be empty")
	private String flat_No;
	@NotEmpty(message = "road_No should not  be  empty")
	private String road_No;
	@NotEmpty
	@Size(min = 3, max = 20, message = "It should be Minimum 3 character and maximum 20")
	private String nearestPoint;
	@NotEmpty
	@Size(min = 3, max = 20, message = "It should be Minimum 3 character and maximum 20")
	private String town;
	@NotEmpty
	@Size(min = 3, max = 20, message = "It should be Minimum 3 character and maximum 20")
	private String province;
	@NotNull(message = "postalCode should  be  valid")
	private int postalCode;

	public CommunicationAddress() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CommunicationAddress(@NotEmpty(message = "flat_No should not be empty") String flat_No,
			@NotEmpty(message = "road_No should not  be  empty") String road_No,
			@NotEmpty @Size(min = 3, max = 20, message = "It should be Minimum 3 character and maximum 20") String nearestPoint,
			@NotEmpty @Size(min = 3, max = 20, message = "It should be Minimum 3 character and maximum 20") String town,
			@NotEmpty @Size(min = 3, max = 20, message = "It should be Minimum 3 character and maximum 20") String province,
			@NotNull(message = "postalCode should  be  valid") int postalCode) {
		super();
		this.flat_No = flat_No;
		this.road_No = road_No;
		this.nearestPoint = nearestPoint;
		this.town = town;
		this.province = province;
		this.postalCode = postalCode;
	}

	public String getFlat_No() {
		return flat_No;
	}

	public void setFlat_No(String flat_No) {
		this.flat_No = flat_No;
	}

	public String getRoad_No() {
		return road_No;
	}

	public void setRoad_No(String road_No) {
		this.road_No = road_No;
	}

	public String getNearestPoint() {
		return nearestPoint;
	}

	public void setNearestPoint(String nearestPoint) {
		this.nearestPoint = nearestPoint;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public int getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}

	@Override
	public String toString() {
		return "CommunicationAddress [flat_No=" + flat_No + ", road_No=" + road_No + ", nearestPoint=" + nearestPoint
				+ ", town=" + town + ", province=" + province + ", postalCode=" + postalCode + "]";
	}

}
