package com.nit.multiThreading;

import java.util.Scanner;

public class BankAccount {
	long accNum;
	String accHolderName;
	double balance;
	
	public BankAccount(long accNum, String accHolderName, double balance) {
		super();
		this.accNum = accNum;
		this.accHolderName = accHolderName;
		this.balance = balance;
	}

	public long getAccNum() {
		return accNum;
	}

	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}

	public String getAccHolderName() {
		return accHolderName;
	}

	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void deposit(double amount) {
		balance=this.balance+amount;
		System.out.println("Amount deposit"+amount+" Total Balance : "+balance);
	}
	public void withdraw(double amount) {
		if(balance<amount) {
			System.out.println("Insufficient balance");
		}else {
			balance=this.balance-amount;
			System.out.println("Withdraw Amount Successfully : "+amount);
		}
		
	}
	public void checkBalance() {
		balance=this.balance;
		System.out.println("Balance is : "+balance);
	}
	
}

