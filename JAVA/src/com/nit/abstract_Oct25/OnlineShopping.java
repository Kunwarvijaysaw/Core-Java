package com.nit.abstract_Oct25;

import java.util.Scanner;

public class OnlineShopping {
	public static void main(String[] args) {
//		DigitalProduct d1 = new DigitalProduct("Laptop", 1000, "Electronic", "KVSRM-143");
//		PhysicalProduct p1 = new PhysicalProduct("Book", 500, "book", 100);
//		System.out.println(d1.toString());
//		d1.applyDiscount(10);
//		d1.calculateTax();
//		System.out.println();
//		System.out.println(p1.toString());
//		p1.applyDiscount(10);
//		p1.calculateTax();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Choice ");
		System.out.println("1.Product\n2.Phycical Product");
		int choice=sc.nextInt();
		switch (choice) {
		
		case 1: {
			System.out.println("Enter Product Name");
			String name = sc.next();
			System.out.println("Enter Price ");
			double price = sc.nextDouble();
			System.out.println("Enter Category");
			String category = sc.next();
			System.out.println("Enter License Key");
			String licenseKey=sc.next();
			DigitalProduct d1 = new DigitalProduct(name, price, category,licenseKey);
			System.out.println(d1.toString());
			d1.applyDiscount(10);
			d1.calculateTax();
		}
		case 2: {
			System.out.println("Enter Product Name");
			String name = sc.next();
			System.out.println("Enter Price ");
			double price = sc.nextDouble();
			System.out.println("Enter Category");
			String category = sc.next();
			System.out.println("Enter Shipping Weight");
			double shippingWeight=sc.nextDouble();
			PhysicalProduct p1 = new PhysicalProduct(name, price, category,shippingWeight);
			System.out.println(p1.toString());
			p1.applyDiscount(10);
			p1.calculateTax();
		}
		}

	}

}

abstract class Product {
	String name;
	double price;
	String category;

	public Product(String name, double price, String category) {
		super();
		this.name = name;
		this.price = price;
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public abstract void applyDiscount(double percentage);

	public abstract void calculateTax();

	@Override
	public String toString() {
		return "Product Name : " + name + 
				"\nCategory :" + category + 
				"\nPrice Rs:" + price;
	}

}

class DigitalProduct extends Product {
	String licenseKey;

	public DigitalProduct(String name, double price, String category, String licenseKey) {
		super(name, price, category);
		this.licenseKey = licenseKey;
	}

	@Override
	public void applyDiscount(double percentage) {
		double discount = getPrice() * percentage / 100;
		double newPrice = getPrice() - discount;
		setPrice(newPrice);
		System.out.println("Discount Applied : " + discount);
		System.out.println("New Price : " + newPrice);

	}

	@Override
	public void calculateTax() {
		double tax = getPrice() * 0.05;
		System.out.println("Tax RS : " + tax);

	}

	@Override
	public String toString() {
		return "Digital Product :" + "\n" + super.toString() + "\nLicense Key : " + licenseKey;
	}

}

class PhysicalProduct extends Product {
	double shippingWeight;

	public PhysicalProduct(String name, double price, String category, double shippingWeight) {
		super(name, price, category);
		this.shippingWeight = shippingWeight;
	}

	@Override
	public void applyDiscount(double percentage) {
		double discount = getPrice() * percentage / 100;
		double newPrice = getPrice() - discount;
		setPrice(newPrice);
		System.out.println("Discount Applied : " + discount);
		System.out.println("New Price : " + newPrice);

	}

	@Override
	public void calculateTax() {
		double tax = getPrice() * 0.08;
		System.out.println("Tax RS : " + tax);

	}

	@Override
	public String toString() {
		return "Physical Product :" + "\n" + super.toString() + "\nShipping Weight : " + shippingWeight;
	}
}