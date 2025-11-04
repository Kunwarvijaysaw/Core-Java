package com.nit.funtional_Interface;
/* Print User Name
--------------------

Scenario:
A program reads a name input and prints it.

Task Requirements:
Create interface PrintName:
void display(String name);

Implement using lambda to print the entered name.*/

@FunctionalInterface
interface PrintName{
	void display(String name);
}
public class Print {

	public static void main(String[] args) {
		PrintName p=(name)->System.out.println(name);
		p.display("KVS ");
	}

}
