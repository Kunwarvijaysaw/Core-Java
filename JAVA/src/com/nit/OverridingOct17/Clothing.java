package com.nit.OverridingOct17;

public class Clothing extends Product {
	String size;

	public Clothing(String name, double price, String size) {
		super(name, price);
		this.size = size;
	}
	
	public void displayInfo() {
		System.out.println("Name : "+name);
		System.out.println("Price : "+price);
		System.out.println("Size : "+size);
	}

}
