/*Electricity Bill Splitter
--------------------------
A group of roommates wants to split the electricity bill equally.
Ask the user to enter total bill amount and number of roommates.
Display the per-person share as the bill is splitted equally among each.
If the number of roommates is 0, handle the ArithmeticException.

Expected Output (Valid Input)
Enter total bill amount: 1200
Enter number of roommates: 4
Each person has to pay: 300.0
Thank you!

Expected Output (Exception Case)
Enter total bill amount: 1500
Enter number of roommates: 0
Error: Number of roommates cannot be zero!
Thank you!*/
package com.nit.exceptionHandling;

import java.util.Scanner;

public class Electricity {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter total bill amount");
		int amount=sc.nextInt();
		if(amount<0) {
			System.err.println("Amount can not be Negative.....");
			System.exit(0);
		}
		System.out.println("Enter No. of roommate");
		int n=sc.nextInt();
		try {
			double perPersonBill=amount/n;
			System.out.println("Each person has to pay: "+perPersonBill);
		}
		catch (ArithmeticException e) {
			System.out.println("Error: Number of roommates cannot be zero!");
		}
		System.out.println("Thank You..............!");
		sc.close();
	}

}
