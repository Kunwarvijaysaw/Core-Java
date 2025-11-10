package com.nit.exceptionHandling;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String ");
		String str=sc.nextLine();
		
		
		try {
			Integer i=Integer.parseInt(str);
			System.out.println("Value of integer : "+i);
		}
		catch(NumberFormatException e) {
			System.out.println("You have enter invalid number.! try again.....");
			
		}
		sc.close();
	}

}
