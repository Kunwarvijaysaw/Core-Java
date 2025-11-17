package com.nit.exceptionHandling;

import java.util.Scanner;

public class PasswordMaker {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Password");
		String pass=sc.nextLine().toUpperCase();
		String p=pass.replaceFirst(pass.substring(0,3),"***");
		
		System.out.println("Password : "+p);

	}

}
