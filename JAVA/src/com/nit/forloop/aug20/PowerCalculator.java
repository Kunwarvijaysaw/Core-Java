package com.nit.forloop.aug20;

import java.util.Scanner;

class PowerCalculator {
	public static void power(int base, int exponent) {
		int result=1;
		for(int i=1;i<=exponent;i++) {
			result=result*base;
		}
		System.out.println(base + " ^ " + exponent + " = " +result);
		
		
	}

	
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter base : ");
		int base=sc.nextInt();
		System.out.println("Enter exponent : ");
		int exponent=sc.nextInt();
		
		power(base,exponent);
		
		

	}


}

