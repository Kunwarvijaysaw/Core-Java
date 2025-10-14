package com.nit.inheritence13Oct25;

public class FixedDepositAccount extends SavingAccount {
	double depositAmount;
	int lockPeriodInMonths;
	public FixedDepositAccount(String accountHolder, long accountNumber, double balance, double interestRate,
			double depositAmount, int lockPeriodInMonths) {
		super(accountHolder, accountNumber, balance, interestRate);
		this.depositAmount = depositAmount;
		this.lockPeriodInMonths = lockPeriodInMonths;
	}
	public void displayFixedDepositeAccountDetails() {
		System.out.println("Deposit Amount :"+depositAmount);
		System.out.println("Lock Period : "+lockPeriodInMonths);
		displaySavingsInfo();
	}

}
