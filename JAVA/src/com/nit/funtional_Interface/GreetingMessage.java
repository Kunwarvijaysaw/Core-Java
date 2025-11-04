package com.nit.funtional_Interface;
/*Scenario:
When the program starts, it should display a welcome message.

Task Requirements:
Create a functional interface named Greet with:
void sayHello();

Implement it using a lambda expression to print:
Hello, Welcome to Java Programming!*/

@FunctionalInterface
interface Greet{
	void sayHello();
}

public class GreetingMessage {
	

	public static void main(String[] args) {
		  Greet x=()->System.out.println("Hello, Welcome to Java Programming!");
		  	x.sayHello();
	}

}
