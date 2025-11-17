/*LAB QUESTION 2 – Account Not Active 
Problem Title: Transaction Restriction on Inactive Accounts Using Custom Exception
Objective:
To practice implementing custom exceptions in Java to enforce business rules
related to account status.


Problem Description:
Create a Java program that simulates performing transactions on a bank account.
If the user attempts to perform a deposit or withdrawal on an inactive account,
the system must throw a custom exception named:
AccountInactiveException

Tasks:
- Create a custom exception class AccountInactiveException (checked exception).
- Create a class Account that contains:
      - A string status (either "active" or "inactive")
      - A method performTransaction(String action)

In the method:
If status is "active", print:
Transaction Successful: <action>

If status is "inactive", throw the custom exception with the message:
Cannot perform <action>, account inactive

In the main method:
 - Read account status and action from the user.
 - Call the transaction method and handle the exception.

Sample Input:
Status: inactive
Action: Deposit

Sample Output:
AccountInactiveException: Cannot perform Deposit, as the account is inactive*/


package com.nit.exceptionHandling;

import java.util.Scanner;

class AccountInactiveException extends Exception {

}

public class BankAccount {
	String status;

	public BankAccount(String status) {
		super();
		this.status = status;
	}

	public void performTransaction(String action) {
		try {
			if (status.equalsIgnoreCase("active")) {
				System.out.println("Transaction Successful: " + action);
			} else {
				throw new AccountInactiveException();
			}
		} catch (AccountInactiveException e) {
			System.out.println("AccountInactiveException: Cannot perform Deposit, as the account is inactive");

		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Status");
		String status = sc.nextLine();
		System.out.println("Enter Action");
		String action = sc.nextLine();
		BankAccount b1 = new BankAccount(status);
		b1.performTransaction(action);

	}

}
