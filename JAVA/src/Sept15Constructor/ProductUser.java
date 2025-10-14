package Sept15Constructor;
/*Online_Shopping_Cart
Create a class Product that stores the name, price, and quantity of a product.
Use a constructor to initialize these values and write a method getTotalPrice() that returns
the total price (price × quantity).
Add a method display() to print the product name and total price.

Class Name:
Product

Instance Variables:
- name (String)
- price (double)
- quantity (int)

Constructor:
- Product(String name, double price, int quantity)

Methods:
- getTotalPrice() → returns price × quantity.
- display() → prints the product name and total price.

Main Class:
- ShoppingMain → contains the main method.

Input Format:
Product name (String)
Price (double)
Quantity (int)

Output Format:
Product: <name>, Total Price: <total>

Note:
Use Scanner with next() for String input.
Sample Input
Laptop
800
1
Sample Output
Product: Laptop, Total Price: 800.0*/

import java.util.Scanner;

class ProductUser {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name : ");
		String name = sc.next();
		System.out.println("Enter Price : ");
		double price = sc.nextDouble();
		System.out.println("Enter Quantity: ");
		int quantity = sc.nextInt();

		Product p1 = new Product(name, price, quantity);
		p1.getTotalPrice();
		System.out.println(p1.display());
	}
}

class Product {
	String name;
	double price;
	int quantity;

	Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;

	}

	public double getTotalPrice() {
		return price * quantity;
	}

	public String display() {
		return "Product: " + name + ", Total Price: " + getTotalPrice();
	}
}
