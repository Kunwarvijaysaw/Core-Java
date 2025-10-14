package Sept01;

import java.util.Scanner;

class Bank {
	long acNo;
	double balance;
	public void deposit(double amount) {
		this.acNo=acNo;
		this.balance=balance;
		balance=balance+amount;
		System.out.println("Deposited " + amount + " into Account " + acNo);
		System.out.println("Account Number: " + acNo + " | Balance: " + balance);
		
		
	}
	public void withdraw(double amount) {
		System.out.println("Withdraw " + amount + " into Account " + acNo);
		 if(balance-amount<0) {
			 System.out.println("Insufficient Balance");
		 }else {
			 balance=balance-amount;
			 System.out.println("Account Number: " + acNo + " | Balance: " + balance); 
		 }
		
		
		
	}

	public static void main(String[] args) {
		Bank b1=new Bank();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Initial balance : ");
		b1.balance=sc.nextDouble();
		
		System.out.println("Enter Account No : ");
		b1.acNo=sc.nextInt();	
		
		System.out.println("Enter Deposit balance : ");
		double dAmount= sc.nextDouble();
		
		
		
		System.out.println("Enter WithDraw balance : ");
		double wAmount= sc.nextDouble();

		System.out.println("Initial Balance : "+b1.balance);
		b1.deposit(dAmount);
	
		b1.withdraw(wAmount);
		
		

	}

}
