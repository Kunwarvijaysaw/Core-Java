package Oct6HasARelation;

import java.util.Scanner;

class MainClass {

	public static void main(String[] args) {

//		Address a1 = new Address("Ameerpet","Hydrabad","Telenghana",828204,"India");
//		Customer c1=new Customer("KVS",a1);
//		Banking b1=new Banking("SBI",12345678,800000,c1);
//		System.out.println(b1.displayDetails());
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Street Name : ");
		String streetName=sc.nextLine();
		System.out.println("Enter City : ");
		String city=sc.nextLine();
		System.out.println("Enter State : ");
		String state=sc.nextLine();
		System.out.println("Enter pincode : ");
		long pinCode=sc.nextLong();
		sc.nextLine();
		System.out.println("Enter Country : ");
		String country=sc.nextLine();
		Address a1 = new Address(streetName,city,state,pinCode,country);
		
		System.out.println("Enter Customer Name : ");
		String name=sc.nextLine();
		Customer c1=new Customer(name,a1);
		System.out.println("Enter Bank Name : ");
		String bankName=sc.nextLine();
		System.out.println("Enter Account No : ");
		long accountNumber=sc.nextLong();
		System.out.println("Enter Balance : ");
		double balance=sc.nextDouble();
		System.out.println("Enter Deposit : ");
		double deposit=sc.nextDouble();
		Banking b1=new Banking(bankName,accountNumber,balance,c1);
		b1.deposit(deposit);
		System.out.println(b1.displayDetails());
		

	}

}
