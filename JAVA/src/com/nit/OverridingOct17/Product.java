package com.nit.OverridingOct17;

public class Product {
	String name;
	double price;
	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	public void displayInfo() {
		System.out.println("Name : "+name);
		System.out.println("Price : "+price);
	}
	
	public double calculateTotalCost(int quantity) {
		double total=price*quantity;
		return total;
	}
}
