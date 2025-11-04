package com.nit.funtional_Interface;
/*Q2. Add Two Numbers
--------------------
Scenario:
A basic calculator is being built. It should add two integers.

Task Requirements:
Create an interface AddNumbers with:
int add(int a, int b);

Use a lambda expression to perform addition and print the result.
*/

@FunctionalInterface
interface AddNumber{
	int add(int a,int b);
}

public class Addition {

	public static void main(String[] args) {
	AddNumber res=(a,b)->	a+b;
	System.out.println(res.add(10, 20));

	}

}
