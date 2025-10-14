package Sept06;
/*
 * WAP to declare a method take two integer and return their sum*/

import java.util.Scanner;

class SumCalculator {
	public static int  findSum(int a,int b) {
		int sum=a+b;
		return sum;
		
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		int a=sc.nextInt();
		System.out.println("Enter Second Number");
		int b=sc.nextInt();
//		int result = findSum(a,b);
		
		System.out.println("Sum of "+a+" and "+b+" is : "+findSum(a,b));
	
	}

}
