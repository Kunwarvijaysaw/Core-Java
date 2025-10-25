package com.nit.forloop.aug20;

import java.util.Scanner;

class ValidPasswordChecker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int up = 0, lw = 0, dg = 0, sp = 0;
		System.out.println("Enter password");
		String pass = sc.nextLine();

		if (pass.length() >= 8) {
			for (int i = 0; i < pass.length(); i++) {
				if (pass.charAt(i) >= 'a' && pass.charAt(i) <= 'z') {
					lw++;
				} else if (pass.charAt(i) >= 'A' && pass.charAt(i) <= 'Z') {
					up++;
				} else if (pass.charAt(i) >= '0' && pass.charAt(i) <= '9') {
					dg++;
				} else {
					sp++;
				}
			}
			if(up>0 && lw>0  && dg>0 && sp>0)
			{
				System.out.println("Valid password");
			}else {
				System.out.println("Invalid passsword");
			}
		} else {
			System.out.println("Pass must be greater than 8 letter");
		}
	}
}
