package springproject;

import org.springframework.stereotype.Component;

import org.springframework.stereotype.Component;

@Component
public class Address {
	
	int dno;
	String street;
	String city;
	
	public Address() {
		dno=1001;
		street="mg road";
		city="bangalore";
	}

	public Address(int dno, String street, String city) {
		super();
		this.dno = dno;
		this.street = street;
		this.city = city;
	}

	public int getDno() {
		return dno;
	}

	public void setDno(int dno) {
		this.dno = dno;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	

}
