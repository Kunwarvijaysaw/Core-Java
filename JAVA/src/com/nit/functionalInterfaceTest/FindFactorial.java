/*Define a Functional Interface named FactorialCalculator with the method:
long calculate(int number);

Implement the interface using a lambda expression that computes the factorial of a given integer.

Write a utility method checkAndPrint(int number, FactorialCalculator calculator) that:

Validates the number.

Computes the factorial using the lambda.

Prints the result in the required format.

If the number is negative, it should print an invalid input message.


Examples
Example 1
Input:
Input as: 5
Output:
Output as: Factorial of 5 is 120

*/
package com.nit.functionalInterfaceTest;

import java.util.Scanner;

@FunctionalInterface
interface FactorialCalculator {
	long calculate(int number);
}

public class FindFactorial {

	public static void checkAndPrint(int number, FactorialCalculator calculate) {
		if (number < 0) {
			System.out.println("Output as: " + number + " is invalid input.");
		} else {
			System.out.println("Output as: Factorial of " + number + " is : " + calculate.calculate(number));
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = sc.nextInt();
		FactorialCalculator f = (num) -> {
			int fact = 1;
			while (num != 0) {

				fact = fact * num;
				num--;
			}
			return fact;
		};

		checkAndPrint(n, f);
	}

}
