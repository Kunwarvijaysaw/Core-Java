package com.nit.forloop.aug20;

import java.util.Scanner;
/*
 * ex-123
 * sum=1+2+3=6
 * multiple=1*2*3=6
 * sum==multiple (this is spy no)
 * */
class SpyNumber {
	public static void isSpyNumber(int number) {
	int sum=0;	
	int product=1;
	while(number!=0) {
		int rem=number%10;
		product=product*rem;
		sum=sum+rem;
		number=number/10;
	}
	if(sum == product) {
	System.out.println("Spy Number ");
	}
	else {
		System.out.println(" Not Spy Number ");
	}
}

 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter  Number : ");
	int number=sc.nextInt();
	isSpyNumber(number);
 }
}
	




