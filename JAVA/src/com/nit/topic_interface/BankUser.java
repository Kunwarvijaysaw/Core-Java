package com.nit.topic_interface;

public class BankUser {

	public static void main(String[] args) {
		SBI sbi = new SBI();
		System.out.println("==========SBI BANK=========\n");
		sbi.openSavingAccount();
		sbi.openCurrentAccount();
		sbi.openCC_Account();
		
		BOI boi = new BOI();
		System.out.println("==========BOI BANK=========\n");
		boi.openSavingAccount();
		boi.openCurrentAccount();
		boi.openCC_Account();
		
		HDFC hdfc = new HDFC();
		System.out.println("==========HDFC BANK=========\n");
		hdfc.openSavingAccount();
		hdfc.openCurrentAccount();
		hdfc.openCC_Account();

	}

}

interface Bank {

	public abstract void openSavingAccount();

	public abstract void openCurrentAccount();

	public abstract void openCC_Account();

}

class SBI implements Bank {
	@Override
	public void openSavingAccount() {
		System.out.println("Savings Account: For personal use, earning interest on deposits.");
	}

	@Override
	public void openCurrentAccount() {
		System.out.println("Current Account: For businesses and professionals, facilitating frequent transactions.");

	}

	@Override
	public void openCC_Account() {
		System.out.println(
				"Credit Card (CC): A separate application process typically, where you apply for a credit card linked to your banking profile. ");

	}

}

class BOI implements Bank {

	@Override
	public void openSavingAccount() {
		System.out.println("Savings Account: Helps individuals save money while earning interest.");
	}

	@Override
	public void openCurrentAccount() {
		System.out.println("Current Account: Designed for business needs with unlimited transactions.");
	}

	@Override
	public void openCC_Account() {
		System.out.println("Credit Card (CC): Allows purchases on credit with repayment flexibility.");
	}

}

class HDFC implements Bank {

	@Override
	public void openSavingAccount() {
		System.out.println("Savings Account: Ideal for saving funds securely and earning regular interest.");
	}

	@Override
	public void openCurrentAccount() {
		System.out.println("Current Account: Suitable for companies to manage daily financial operations smoothly.");
	}

	@Override
	public void openCC_Account() {
		System.out.println("Credit Card (CC): Provides instant credit for payments with a defined credit limit.");
	}

}