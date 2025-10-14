package com.nit.inheritence13Oct25;

public class Car extends Vehicle{
	String model;
	String fuelType;
	public Car(String brand, double speed, String model, String fuelType) {
		super(brand, speed);
		this.model = model;
		this.fuelType = fuelType;
	}
	public void displayCarDetails() {
		displayDetails();
		System.out.println("Model Name : "+model);
		System.out.println("Fuel Type : "+fuelType);
	}

}
