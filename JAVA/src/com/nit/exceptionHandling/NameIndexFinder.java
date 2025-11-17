/*Q4. Name Initial Finder – Online Form
Scenario:
A web form asks users to enter their full name and selects a character
from the name based on a given index.

Requirements:
Input full name.
Input index number.

Display the character at that index.
If user enters an out-of-bound index, catch StringIndexOutOfBoundsException
and show:
"Invalid position. Index is outside the name length."*/

package com.nit.exceptionHandling;

import java.util.Scanner;

public class NameIndexFinder {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Full Name");
		String name=sc.nextLine().toUpperCase();
		System.out.println("Enter Index.");
		int index=sc.nextInt();
		
		try {
			char res=name.charAt(index);
			System.out.println(name+" of index "+index+" value is : "+res);
		} catch (Exception e) {
			System.out.println("Invalid position. Index is outside the name length");
		}
	}

}
