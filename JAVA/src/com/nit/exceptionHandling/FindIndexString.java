package com.nit.exceptionHandling;

import java.util.Scanner;

public class FindIndexString {

	public static void main(String[] args) {
		//String str="KUNWARVIJAYSAW";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str =sc.nextLine();
		System.out.println("Enter index");
		int i=sc.nextInt();	
		//System.out.println("index "+i+" is : "+str.charAt(i));
			
			try {
				System.out.println("index "+i+" is : "+str.charAt(i));
			}
			catch(StringIndexOutOfBoundsException e) {
				System.out.println("Access beyond the index of STRING . try again");
			}
	}

}
