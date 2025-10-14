package Aug20forloop;

import java.util.Scanner;

/*Q1. ATM PIN Validation
A bank’s ATM software needs to check how many digits a customer’s PIN has before
processing it.
Write a program to count the digits of a number.
Class Name: PinValidator
Method Name: countDigits(int number)
Return Type: void
Variable Suggestion: digitCount – stores the count of digits.*/

class AtmPinValidation {
	public static void countDigits(int number) {
		//int pass;
		int count=0;
		while(number>0) {
			 count++;
			 number=number/10;
		}
		System.out.println("Digit of password is : "+count);
	}
	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter password : ");
		int number=sc.nextInt();
		countDigits( number);
		
	}

}
