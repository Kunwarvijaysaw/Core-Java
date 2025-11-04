package com.nit.funtional_Interface;
/*Scenario:
Program needs to determine whether a number is even or not.

Task Requirements:
Create interface CheckEven:
boolean isEven(int num);

Use lambda to check and print result.
*/

@FunctionalInterface
interface CheckEven{
	boolean isEven(int num);
}
public class EvenOdd {

	public static void main(String[] args) {
		CheckEven res=(n)->n%2==0;
		System.out.println("Even number : "+res.isEven(5));
	}

}
