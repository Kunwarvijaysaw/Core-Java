package com.nit.multiThreading;

public class BankUser {
	private double balance;
	
	public synchronized void deposit(double amount) {
		
		System.out.println("Thread deposit name  : "+Thread.currentThread().getName());
		balance+=amount;
		System.out.println("Balance Upadated. new Balance : "+balance);
	}

	public static void main(String[] args) {
		BankUser b1=new BankUser();
		
	

	}

}
