package it.unical.asde.hibernatedemo.model;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	
	private String city;
	private String street;
	private Integer streetNumber;
	
	public Address(String city, String street, Integer streetNumber) {
		super();
		this.city = city;
		this.street = street;
		this.streetNumber = streetNumber;
	}

	public Address() {
		super();
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public Integer getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(Integer streetNumber) {
		this.streetNumber = streetNumber;
	}
	
	
	
	
	
}
