//package com.nit.exceptionHandling;
//class InsufficientBalanceException extends Exception {
//    public InsufficientBalanceException(String message) {
//        super(message);
//    }
//}
//class OverdraftLimitExceededException extends Exception {
//    public OverdraftLimitExceededException(String message) {
//        super(message);
//    }
//}
//
//public class OnlineBankinSystem {
//
//	public static void main(String[] args) throws InsufficientBalanceException, OverdraftLimitExceededException {
//		SavingAccount s1 = new SavingAccount(123456789, 10000);
//		CurrentAccount c1 = new CurrentAccount(987465123, 20000, 10000);
//		   try {
//	            s1.deposit(500); // 1500
//	            c1.withdraw(650); // -150
//	        } catch (Exception e) {
//	            System.out.println(e.getMessage());
//	        }
//
//	}
//
//}
//
//interface AccountOperations {
//	public void deposit(double amount);
//
//	public void withdraw(double amount) throws InsufficientBalanceException, OverdraftLimitExceededException;
//}
//
//abstract class BankAccount1 implements AccountOperations {
//	// create private variables
//	private long accNo;
//	private double balance;
//
//	public BankAccount1(long accNo, double balance) {
//		super();
//		this.accNo = accNo;
//		this.balance = balance;
//	}
//
//	public long getAccNo() {
//		return accNo;
//	}
//
//	public void setAccNo(long accNo) {
//		this.accNo = accNo;
//	}
//
//	public double getBalance() {
//		return balance;
//	}
//
//	public void setBalance(double balance) {
//		this.balance = balance;
//	}
//
//	@Override
//	public void deposit(double amount) {
//		balance += amount;
//		System.out.println("After Deposit Balance : " + balance);
//	}
//
//}
//
//class SavingAccount extends BankAccount1 {
//
//	public SavingAccount(long accNo, double balance) {
//		super(accNo, balance);
//
//	}
//
//	@Override
//	public void deposit(double amount) {
//		this.deposit(amount + this.getBalance());
//		System.out.println("After Deposit Balance : " + this.getBalance());
//	}
//
//	@Override
//	public void withdraw(double amount) throws InsufficientBalanceException {
//		if (getBalance() < amount) {
//
//			throw new InsufficientBalanceException("Insufficient Balance");
//
//		}
//		this.withdraw(amount);
//
//	}
//
//}
//
//class CurrentAccount extends BankAccount1 {
//	double overdraftLimit;
//	private double getBalance;
//
//	public CurrentAccount(long accNo, double balance, double overdraftLimit) {
//		super(accNo, balance);
//		this.overdraftLimit = overdraftLimit;
//	}
//	@Override
//    public void deposit(double amount) {
//        getBalance += amount;
//        System.out.println("Deposit successful! Current balance: " + getBalance());
//    }
//
//	@Override
//	public void withdraw(double amount) throws InsufficientBalanceException, OverdraftLimitExceededException {
//		if (getBalance() < amount) {
//			throw new OverdraftLimitExceededException("Overdraft limit exceeded!");
//		} else {
//			System.out.println("Balance : " + (getBalance() - amount));
//		}
//
//	}
//
//}
//
