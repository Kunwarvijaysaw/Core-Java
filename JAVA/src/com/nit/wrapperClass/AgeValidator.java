/*HackerRank Practice Set – Wrapper Classes in Java
=====================================================

Question 1: User Age Validation (Integer Wrapper)
----------------------------------------------------------
Problem Statement:
Write a program to validate a user’s age entered as a string. You must convert the string to an integer using a wrapper class.
If the conversion fails (invalid input), print "Invalid age". If the conversion succeeds, check if the user is eligible (≥ 18 years).

Class Name: AgeValidator

Instance Variables:
private String ageInput;

Constructor:
public AgeValidator(String ageInput)

Methods:
public Integer convertToAge() — Converts string to Integer, prints "Invalid age" if invalid.
public void checkEligibility() — Prints "Eligible" if age ≥ 18 else "Not Eligible".

Input Format:
<age as string>

Output Format:
Eligible / Not Eligible / Invalid age

Sample Test Cases:
Input: 25 → Eligible
Input: 16 → Not Eligible
Input: abc → Invalid age
Input: -5 → Not Eligible
Input: (empty) → Invalid age

*/
package com.nit.wrapperClass;

import java.util.Scanner;



public class AgeValidator {
	
		private String ageInput;

		public AgeValidator(String ageInput) {
			super();
			
			this.ageInput = ageInput;
		}
		
		public Integer convertToAge(String ageInput) {
			return Integer.parseInt(ageInput);
		}

		public void checkEligibility() {
			if (convertToAge(ageInput) >= 18) {
				System.out.println("Eligible");
			} else {
				System.out.println("Not eligible!......");
			}

		}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age in Word");
		String ageInput = sc.nextLine();
		AgeValidator p1 = new AgeValidator(ageInput);
		p1.checkEligibility();

	}

}
