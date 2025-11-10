/*Implement a lambda expression that return sum of divisors of an given number.
For the number 12, the divisors are 1, 2, 3, 4, 6, 12. The sum of these divisors is 1 + 2 + 3 + 4 + 6 + 12 = 28.

*/
package com.nit.functionalInterfaceTest;

import java.util.Scanner;

@FunctionalInterface
interface SumOfDivisor {
	int calculate(int number);
}

public class SumOfDivisors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number ");
		int n = sc.nextInt();
		if (n < 0) {
			System.out.println("Negative value not allowed.");
			System.exit(0);
		}

		SumOfDivisor s = (num) -> {
			int sum = 0;
			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					sum = sum + i;
				}
			}
			return sum;
		};
		System.out.println("Sum of divisors of " + n + " is : " + s.calculate(n));
	}
}
