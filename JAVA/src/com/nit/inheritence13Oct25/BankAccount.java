package com.nit.inheritence13Oct25;

public class BankAccount {
	String accountHolder;
	long accountNumber;
	public BankAccount(String accountHolder, long accountNumber) {
		super();
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
	}
	public void displayBankAccountInfo() {
		System.out.println("Account Holder Name : "+accountHolder);
		System.out.println("Account Number : "+accountNumber);
	}

}
