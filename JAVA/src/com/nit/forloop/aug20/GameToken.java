package com.nit.forloop.aug20;

import java.util.Scanner;

/*Q4. Game Token Calculation
In a board game, a token’s power is decided by multiplying all digits of the token
number.
Write a program to print the digital product of a number.
Class Name: GameToken
Method Name: digitalProduct(int number)
Return Type: void
Variable Suggestion: product
*/

class GameToken {
	public static void digitalProduct(int number) {
		int product=1;
		while(number!=0) {
			int rem=number%10;
			product=product*rem;
			number=number/10;
		}
		System.out.println("digital product of a number : "+product);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter token Num : ");
		int number=sc.nextInt();
		digitalProduct(number);
		

	}

}
