package com.nit.inheritence13Oct25;

public class SavingAccount extends BankAccount {
	double balance;
	double interestRate;
	public SavingAccount(String accountHolder, long accountNumber, double balance, double interestRate) {
		super(accountHolder, accountNumber);
		this.balance = balance;
		this.interestRate = interestRate;
	}
	public void displaySavingsInfo() {
		
		System.out.println("Balance : Rs."+balance);
		System.out.println("InterestRate : "+interestRate+" %");
		displayBankAccountInfo();
	}

}
