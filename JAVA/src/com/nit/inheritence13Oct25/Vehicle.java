package com.nit.inheritence13Oct25;

public class Vehicle {
	String brand;
	double speed;
	
	Vehicle(String brand,double speed){
		this.brand=brand;
		this.speed=speed;
		
	}
	public void displayDetails() {
		System.out.println("Brand Name : "+brand);
		System.out.println("Speed : "+speed+" Km/h");
	}

}
