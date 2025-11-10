/*Create a Functional Interface named PalindromeChecker with a method isPalindrome which is parameterize method taking int type value.

Implement this interface using a lambda expression that checks whether a number is a palindrome.

Write a utility method checkAndPrint(int number, PalindromeChecker checker) that:

Validates the number.

Checks if it's a palindrome.

Prints the result in the specified format.

If the input is negative, it should be marked as invalid.

Take ELC class PalindromeCheckerMain 
take one method checkAndPrint(int number, PalindromeChecker checker) and based on the logic  print wheather it is palindrome or not . 
take main method inside that implement the lambda expression and invoke the method respectively based on the following test cases.

Examples
Example 1
Input:
Input as: 121
Output:
Output as: 121 is a palindrome.
*/
package com.nit.functionalInterfaceTest;

import java.util.Scanner;

@FunctionalInterface
interface PalindromeChecker {
	boolean isPalindrome(int number);
}

public class Palindrome {
	public static void checkAndPrint(int number, PalindromeChecker checker) {
		boolean res = checker.isPalindrome(number);
		if (res == true) {
			System.out.println("Output as: " + number + " is a palindrome.");
		} else {
			System.out.println("Output as: " + number + " is not a palindrome.");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = sc.nextInt();
		if (n < 0) {
			System.out.println("Output as: " + n + " is invalid input.");
			System.exit(0);
		}
		PalindromeChecker p = (num) -> {
			int temp = num;
			int rev = 0;
			while (temp != 0) {
				int rem = temp % 10;
				rev = rev * 10 + rem;
				temp = temp / 10;
			}
			if (num == rev) {
				return true;
			} else {
				return false;
			}
		};
		p.isPalindrome(n);
		checkAndPrint(n, p);
	}

}
