package com.nit.exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MobileRecharge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Recharge amount : ");
		try {
			int amount = sc.nextInt();
			if (amount < 0) {
				System.out.println("Invalid amount. Must be positive.");

			} else {
				System.out.println("Recharge successful: " + amount);
			}
		} catch (InputMismatchException e) {
			System.out.println("Invalid amount. Must be positive.");
		}

		finally {
			System.out.println("Thank you for using the service.");

		}
	}

}
