/*LAB QUESTION 1 – Exceed Daily Limit
Problem Title: Exceed Daily Withdrawal Limit Using Custom Exception
Objective:
To implement custom exception handling in Java for enforcing business
rules related to banking transactions.

Problem Description:
Write a Java program that simulates a simple ATM withdrawal process.
The system must enforce a daily withdrawal limit. If the user attempts
to withdraw an amount greater than the allowed limit, the program
should throw and handle a custom exception named:
DailyLimitExceededException

Tasks:
Create a custom exception class DailyLimitExceededException
(checked exception).
Create a class BankAccount that contains:
 - An integer dailyLimit
 - A method withdraw(int amount)

In the withdraw() method:
If amount <= dailyLimit, print:
Withdrawal Successful: <amount>

If amount > dailyLimit, throw the custom exception with the message:
Withdraw <amount> exceeds limit <dailyLimit>

In the main method:
Read daily limit and withdrawal amount from the user.
Call the withdraw() method and handle the exception properly.

Sample Input:
Daily Limit: 10000
Withdraw: 15000

Sample Output:
DailyLimitExceededException: Withdraw 15000 exceeds limit 10000

Notes:
Valid withdrawals should print a success message.
This exercise demonstrates the creation and use of custom exceptions in Java.*/

package com.nit.exceptionHandling;

import java.util.Scanner;

class DailyLimitExceededException extends Exception {

}

public class ATM_DailyPinLimit {
	int dailyLimit;

	public ATM_DailyPinLimit(int dailyLimit) {
		super();
		this.dailyLimit = dailyLimit;

	}

	public void withdraw(int amount) {
		try {
			if (amount <= dailyLimit) {
				System.out.println("Withdrawal Successful: " + amount);
			} else {
				throw new DailyLimitExceededException();
			}
		} catch (DailyLimitExceededException e) {
			System.out.println("Withdraw " + amount + " exceeds limit " + dailyLimit);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter daily limit");
		int dailyLimit = sc.nextInt();
		System.out.println("Enter withdraw Amount: ");
		int amount = sc.nextInt();
		ATM_DailyPinLimit a = new ATM_DailyPinLimit(dailyLimit);
		a.withdraw(amount);
		sc.close();

	}

}
