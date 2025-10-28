package com.nit.abstract_Oct25;
/*Develop a scenario based program by using abstract class and abstract method for displaying different kinds of Products like Digital Product and Physical Product as well as discount and tax applicable on thses products

We need to develop one program on Hierarchical Inheritance, where Product is the super class and It has two sub classes DigitalProduct and PhysicalProduct.

Validate all the user inputs in constructor and where it is required.

Coding Requirements :
---------------------
Create one BLC class called Product.

Attributes/Properties/Fields :[Access Modifier private for all the fields]
-------------------------------------------------------------------
name : String
price : double 
category : String

Take a parameterized constructor to initialize all the fields.

Methods :

a) Method Name     : applyDiscount()
Argument           : One argument of type double [double percentage]
Return Type        : void
Modifiers          : public and abstract 



b) Method Name     : calculateTax()
Argument           : No Argument
Return Type        : double
Modifiers          : public and abstract


c) Setter and getter for price variable.

d) Generate toString() method to print Object properties. 


Create another class DigitalProduct which extends from Product class.

Attributes/Properties/Fields :[Access Modifier private for all the fields]
-------------------------------------------------------------------------
licenseKey : String

Take a parameterized constructor to initialize all the fields.

Methods :
a) Override applyDiscount(double percentage) method
   In this method find out the discount based on the given percentage on the product price.
   Update the new price based on the given discount.
   Print both Discount and Updated Price.


b)Override calculateTax() method 
  In this method you should return 5% tax on the discounted price.

c) Generate toString() to print all the fields


Create another class PhysicalProduct which extends from Product class.

Attributes/Properties/Fields :[Access Modifier private for all the fields]
-------------------------------------------------------------------------
shippingWeight : double

Take a parameterized constructor to initialize all the fields.

Methods :
a) Override applyDiscount(double percentage) method
   In this method find out the discount based on the given percentage on the product price.
   Update the new price based on the given discount.
   Print both Discount and Updated Price.


b)Override calculateTax() method 
  In this method you should return 8% tax on the discounted price.

c)
Method Name        : calculateShippingCost()
Argument           : No argument
Return Type        : double
Access modifier    : public 
 
In this method you need to calculate and return shipping cost of the Physical Product. The defined shipping cost is 5 RS per KG.

d) Generate toString() to print all the fields

Create an ELC class called ProductStore.

Inside main method display the following details as a Menu.
Select Product Type:
1. Digital Product
2. Physical Product

Write Switch case with Scanner class to select Digital OR Physical Product

Examples
Example 1
Input:
Enter Digital Product Name :Java E Book
Enter Product Price :1000
Enter Product Category :Electronics
Enter Product License Key :E_BOOK_001
Enter the discount % on final bill
10
Output:
Digital Product :
Product Name: Java E Book
Category: Electronics
Price RS:1000.0
License Key: E_BOOK_001
Discount applied :100.0
New Price :900.0
Tax RS : 45.0*/
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