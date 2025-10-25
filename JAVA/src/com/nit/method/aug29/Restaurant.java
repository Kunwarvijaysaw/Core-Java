package com.nit.method.aug29;

import java.util.Scanner;

public class Restaurant {
	String restaurantName;
	String lastOrderedItem;
	static int totalOrder;
	
	public  void placeOrder(String itemName, int quantity) {
		
		lastOrderedItem = itemName;
		totalOrder=totalOrder+quantity;

	}
	

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		Restaurant r1=new Restaurant();//1

		
		System.out.println("Enter Restaurant Name : ");
		r1. restaurantName = sc.nextLine();
		System.out.println("Enter Food item Name : ");
		String itemName = sc.nextLine();
		System.out.println("Enter Quantity : ");
		int quantity = sc.nextInt();
		sc.nextLine();
		r1.placeOrder(itemName,quantity);
		
		
		
		Restaurant r2=new Restaurant();
		System.out.println("Enter Restaurant Name : ");
		r2. restaurantName = sc.nextLine();
		System.out.println("Enter Food item Name : ");
		String itemName2 = sc.nextLine();
		System.out.println("Enter Quantity : ");
		int quantity2 = sc.nextInt();
		r2.placeOrder(itemName2,quantity2);
		
		System.out.println("======Restaurant 1 Details====");
		System.out.println(" Restaurant Name : "+r1.restaurantName);
		System.out.println("Item Name : "+itemName);
		System.out.println("Quantity : "+quantity);
//		System.out.println("total orders by restaurents are  "+totalOrder);
//		System.out.println("======Thank you 🙏❤️=======");
		
		System.out.println("======Restaurant 2 Details====");
		System.out.println(" Restaurant Name : "+r2.restaurantName);
		System.out.println("Item Name : "+itemName2);
		System.out.println("Quantity : "+quantity2);
		System.out.println("total orders by restaurents are  "+totalOrder);
		System.out.println("======Thank you 🙏❤️=======");
		

		
		
	
	 
	}

}
