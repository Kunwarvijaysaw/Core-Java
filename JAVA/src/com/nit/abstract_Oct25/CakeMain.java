package com.nit.abstract_Oct25;

import java.util.Scanner;

public class CakeMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Choice ");
		int choice=sc.nextInt();
		switch (choice) {
		case 1: {
			Cake c1=new OrderedCake();
			System.out.println(c1);
		}
		case 2: {
			System.out.println("Enter Flavour");
			String flavour = sc.next();
			System.out.println("Enter Shape");
			String shape = sc.next();
			System.out.println("Enter Quantity");
			int quantity = sc.nextInt();
			Cake c2=new OrderedCake(flavour, shape, quantity);
			System.out.println(c2);
		}
		case 3: {
			System.out.println("Enter Flavour");
			String flavour = sc.next();
			System.out.println("Enter Shape");
			String shape = sc.next();
			System.out.println("Enter Quantity");
			int quantity = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Message");
			String message=sc.nextLine();
			Cake c3=new OrderedCake(flavour, shape, quantity,message);
			System.out.println(c3);
		}
		}

	}

}
class Cake{
	private String shape;
	private String flavour;
	private int quantity;
	static double price = 400;
	public Cake(String shape, String flavour, int quantity) {
		super();
		this.shape = shape;
		this.flavour = flavour;
		this.quantity = quantity;
	}
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	public String getFlavour() {
		return flavour;
	}
	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public String toString() {
		return "A " + shape + " " + flavour + " Cake of " + quantity+" KG is Ready @ Rs."+price*quantity ;
	}

}

class OrderedCake extends Cake{
	private String message;
	
	
	public OrderedCake() {
		super(" Round","Vanila",1);
	}

	public OrderedCake(String shape, String flavour, int quantity) {
		super(shape, flavour, quantity);
	}

	public OrderedCake(String shape, String flavour, int quantity, String message) {
		super(shape, flavour, quantity);
		this.message = message;
	}
	
	@Override
	public String toString() {
		if(message != null)
			return "A " + super.getShape() + " " + super.getFlavour() + " Cake of " + super.getQuantity()+" KG is Ready with "+ message +" @ Rs."+price*super.getQuantity() ;
		else 
			return super.toString();
	}
	
	
	
	
	
}