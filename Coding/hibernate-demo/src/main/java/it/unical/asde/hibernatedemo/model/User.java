package it.unical.asde.hibernatedemo.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User {

	@Id
	private String username;

	@Embedded
	private Address address;

	@ElementCollection
	private List<String> phoneNumbers;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
	private List<Car> userCars;

	private Date registrationDate;

	public User() {
		super();
	}

	public User(String username, Address address, List<String> phoneNumbers, List<Car> userCars,
			Date registrationDate) {
		super();
		this.username = username;
		this.address = address;
		this.phoneNumbers = phoneNumbers;
		this.userCars = userCars;
		this.registrationDate = registrationDate;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	public List<String> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(List<String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public List<Car> getUserCars() {
		return userCars;
	}

	public void setUserCars(List<Car> userCars) {
		this.userCars = userCars;
	}

}
