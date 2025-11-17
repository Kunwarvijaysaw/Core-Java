/*Q3. Loan EMI Calculator – Banking Application
Scenario:
A bank loan EMI calculator needs to determine monthly payment.

Requirements:
Input loan amount.
Input number of months to repay.
Calculate: emi = loanAmount / months

If months entered is 0, catch exception and show:
"Invalid duration. Months cannot be 0."
-------------------------------------------------------------------*/

package com.nit.exceptionHandling;

import java.util.Scanner;

public class EMI_Calculator {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Loan Amount");
		int amount=sc.nextInt();
		System.out.println("Enter number of months to repay.");
		int month=sc.nextInt();
		
		try {
			double emi=amount/month;
			System.out.println("EMI of Loan : "+emi+" per month");
			
		} catch (ArithmeticException e) {
			System.out.println("Invalid duration. Months cannot be 0.");
		}
	}

}
