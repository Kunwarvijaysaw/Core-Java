package com.nit.funtional_Interface;
/*Q4. Calculate Square of a Number
--------------------

Scenario:
A math learning application calculates squares.

Task Requirements:
Create interface Square:
int calculate(int num);

Use lambda expression to compute the square of a number.
*/
@FunctionalInterface
interface Square{
	int calculate(int num);	
}


public class FindSqure {

	public static void main(String[] args) {
		Square squre=(n)->n*n;
		System.out.println("Squre of  is : "+squre.calculate(5));

	}

}
