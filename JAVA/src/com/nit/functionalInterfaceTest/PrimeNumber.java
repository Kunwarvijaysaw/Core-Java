/*Define a Functional Interface named PrimeChecker with a method:
boolean isPrime(int number);

Use a lambda expression to implement prime number checking.

Create a method checkAndPrint(int number, PrimeChecker checker) that:

Validates the number.

Uses the lambda to check for primality.

Prints the result.

For numbers less than or equal to 1, print an invalid input message.


Examples
Example 1
Input:
Input as: 7
Output:
7 is prime
*/
package com.nit.functionalInterfaceTest;

import java.util.Scanner;

@FunctionalInterface
interface PrimeChecker {
	boolean isPrime(int number);
}

public class PrimeNumber {
	public static void checkAndPrint(int num, PrimeChecker check) {
		boolean re = check.isPrime(num);
		if (re == true) {
			System.out.println("Output as: " + num + " is a prime number.");
		} else {
			System.out.println("Output as: " + num + " is not a prime number.");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number ");
		int n = sc.nextInt();
		if (n <= 1) {
			System.out.println("Output as: " + n + " is invalid input.");
			System.exit(0);
		}
		PrimeChecker p = (num) -> {
			int c = 0;
			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					c++;
				}
			}
			if (c == 2) {
				return true;
			} else {
				return false;
			}
		};
		p.isPrime(n);
		checkAndPrint(n, p);
		sc.close();
	}

}
