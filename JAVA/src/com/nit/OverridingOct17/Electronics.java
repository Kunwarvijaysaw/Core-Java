package com.nit.OverridingOct17;

public class Electronics extends Product {
	String brand;

	public Electronics(String name, double price, String brand) {
		super(name, price);
		this.brand = brand;
	}
	public void displayinfo() {
		System.out.println("Name : "+name);
		System.out.println("Price : "+price);
		System.out.println("Brand : "+brand);
		
	}

}
