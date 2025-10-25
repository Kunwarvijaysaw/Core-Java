package com.nit.forloop.aug20;

import java.util.Scanner;

class OddPlaceDigitProduct {
	public static void productOddPosition(int number) {
		int epds=1;
		int opds=1;
		while(number!=0) {
			int rem=number%10;
			opds=opds*rem;
			number=number/10;
//			if(number!=0) {
			int rem2=number%10;
			epds=epds*rem2;
			number=number/10;
//			}
		}
		System.out.println("Product Odd Position: "+opds);
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number : ");
		int number=sc.nextInt();
		productOddPosition(number);
		
		

	}

}
