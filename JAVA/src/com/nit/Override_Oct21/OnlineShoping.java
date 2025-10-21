package com.nit.Override_Oct21;

import java.util.Scanner;

class OnlineShoping {
	public static void generateBill(Customer cust, double... prices) {
        cust.calculateBill(prices);
    }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" Please select the Customer Type to get additional Discount :");
		System.out.println("1.General Customer ");
		System.out.println("2.Prime Customer  ");
		System.out.println("3.VIP Customer ");
		System.out.println("Please enter Customer type :");
		int choice=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		String name=sc.nextLine();
		System.out.println("Enter number of Items :");
		int n=sc.nextInt();
		double item[]=new double[n];
		System.out.println("Enter item name and Price!");
		for(int i=0;i<n;i++) {
			System.out.println((i+1)+"item name : ");
			sc.next();
			System.out.println("Price : ");
			item[i]=sc.nextDouble();
		}
		 Customer cust = null;
		switch (choice) {
		case 1: cust=new GeneralCustomer(name);break;
		case 2:cust = new PrimeCustomer(name);break;
		case 3: cust =new VIPCustomer(name);break;
		default :  System.out.println("Invalid choice"); System.exit(0);
		
		}
		generateBill(cust, item);
		
//		GeneralCustomer g1=new GeneralCustomer("KVS");
//		g1.calculateBill(500,200,400);
//		System.out.println("==================");
//		PrimeCustomer p1=new PrimeCustomer("SRM");
//		p1.calculateBill(100,800,900,400);
//		System.out.println("==================");
//		VIPCustomer v1=new VIPCustomer("KVSRM");
//		v1.calculateBill(600,400,500,800);

	}

}
class Customer{
	String name;

	public Customer(String name) {
		if(name==null || name.isEmpty()) {
			System.out.println("Invalid Name ");
		}else {
		this.name = name;
		}
	}
	public void calculateBill(double ...price) {
		double total=0;
//		double discount=0;
		
			for(double p:price) {
				if(p<0) {
					System.err.println("Invalid amount!");
					System.exit(0);
				}else {
					total+=p;
				
			}
		}
			System.out.println("Welcome to Hyderabad Mall :");
			System.out.println("Name : "+name);
			System.out.println("Total : "+total);
			System.out.println("Discount : No discount! ");
		
	}
	
	
}
class GeneralCustomer extends Customer{

	public GeneralCustomer(String name) {
		super(name);
	}
	public void calculateBill(double ...price) {
		super.calculateBill(price);
	}
	
	
}
class PrimeCustomer extends Customer{
	double discountRate = 10.0;

	public PrimeCustomer(String name) {
		super(name);
	}
	public void calculateBill(double ...price) {
		double total=0;
		
			for(double p:price) {
				if(p<0) {
					System.err.println("Invalid amount!");
					System.exit(0);
				}else {
					total+=p;
				
			}
		}
			double discount=total-total*discountRate/100;
			System.out.println("Welcome to Hyderabad Mall :");
			System.out.println("Name : "+name);
			System.out.println("Total : "+total);
			System.out.println("Discount : "+discount);
		
	}
	
	
	
}
class VIPCustomer extends Customer{
	double discountRate = 15.0;

	public VIPCustomer(String name) {
		super(name);
	}
	public void calculateBill(double ...price) {
		double total=0;
		
			for(double p:price) {
				if(p<0) {
					System.err.println("Invalid amount!");
					System.exit(0);
				}else {
					total+=p;
				
			}
		}
			double discount=total-total*discountRate/100;
			System.out.println("Welcome to Hyderabad Mall :");
			System.out.println("Name : "+name);
			System.out.println("Total : "+total);
			System.out.println("Discount : "+discount);
		
	}
	
	
	
}
