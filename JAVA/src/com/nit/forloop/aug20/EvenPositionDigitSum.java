package com.nit.forloop.aug20;
/*Q7. Even Position Digit Sum – Banking Check
A banking application checks fraud by summing digits at even places in an account
number.
Write a program to print the sum of digits at even places.
Class Name: EvenDigitSum
Method Name: sumEvenPosition(int number)
Return Type: void
Variable Suggestion: sum, position
*/


import java.util.Scanner;

class EvenPositionDigitSum {

	public static void sumEvenPosition(int number) {
		int epds=0;
		int opds=0;
		while(number!=0) {
			int rem=number%10;
			opds=opds+rem;
			number=number/10;
			int rem2=number%10;
			epds=epds+rem2;
			number=number/10;
		}
		System.out.println("Sum Even Position: "+epds);
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number : ");
		int number=sc.nextInt();
		sumEvenPosition(number);
		
		

	}

}


