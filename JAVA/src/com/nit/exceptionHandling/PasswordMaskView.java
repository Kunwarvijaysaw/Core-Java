package com.nit.exceptionHandling;

import java.util.Scanner;

public class PasswordMaskView {
	
	public static void checker(String pass) throws Exception {
		if(pass.length()>3) {
			
		}else {
			throw new Exception("Password too short to fetch 3rd character.\"");
		}
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Password");
		String pass=sc.nextLine().toUpperCase();

		try {
			checker(pass);
			System.out.println("Strong Password!!!");
		}catch(Exception e) {
			System.err.println(e.getMessage());
		}finally {
			sc.close();
			System.out.println("Thank You for Using!!!");
		}
	}

}
