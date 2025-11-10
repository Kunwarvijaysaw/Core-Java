/**/
package com.nit.exceptionHandling;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		int a = sc.nextInt();
		System.out.println("Enter Second Number : ");
		int b = sc.nextInt();
		int c = 0;
		try {
			c = a / b;
			System.out.println("Result : " + c);
		} catch (ArithmeticException e) {
			System.err.println("Warning !! don't divide any number by 0");

		}
		sc.close();

	}

}
