/*LAB QUESTION 8 – ATM Out of Cash

Problem Title: Scenario:
An ATM tracks how much money it has remaining.
If a user attempts to withdraw more money than the ATM contains, throw:
ATMOutOfCashException

Input Example:
ATM Cash Available: 20000
Withdraw Amount: 25000

Expected Output:
ATMOutOfCashException: ATM has insufficient cash (Available: 20000)

Notes:
Valid withdrawal prints:
Dispensing: <amount>*/
package com.nit.exceptionHandling;

import java.util.Scanner;

class ATMOutOfCashException extends Exception {
	
}

public class ATM_Withdraw {
	double ATM_CashAvailable;
	

	public ATM_Withdraw(double aTM_CashAvailable) {
		super();
		ATM_CashAvailable = aTM_CashAvailable;
	}
	public void withdraw(double amount) {
		try {
			if(ATM_CashAvailable>amount) {
				System.out.println("WithDraw Successfully");
			}else {
				throw new ATMOutOfCashException();
			}
		} catch (Exception e) {
			System.out.println("ATMOutOfCashException: ATM has insufficient cash : "+ATM_CashAvailable);
		}
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ATM_CashAvailable");
		double ATM_CashAvailable = sc.nextInt();
		System.out.println("Enter withdraw Amount: ");
	double amount = sc.nextInt();
	ATM_Withdraw a1=new ATM_Withdraw(ATM_CashAvailable);
	a1.withdraw(amount);

	}

}
