package it.unical.asde.hibernatedemo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Car {

	@Id
	private String plate;
	
	private String model;
	
	private String brand;
	
	@ManyToOne
	private User owner;

	public Car() {
		super();
	}
	

	public Car(String plate, String model, String brand, User owner) {
		super();
		this.plate = plate;
		this.model = model;
		this.brand = brand;
		this.owner = owner;
	}


	public String getPlate() {
		return plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public User getOwner() {
		return owner;
	}

	public void setOwner(User owner) {
		this.owner = owner;
	}
	
	

	
	
	
	
}
