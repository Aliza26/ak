package com.akriti.vo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Car {
	@Id
	int carId;
	
	String color;
	
	double price;

	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Car(int carId, String color, double price) {
		super();
		this.carId = carId;
		this.color = color;
		this.price = price;
	}

	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	
	

}
