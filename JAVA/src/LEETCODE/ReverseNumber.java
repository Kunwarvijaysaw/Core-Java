package LEETCODE;

import java.util.Scanner;

public class ReverseNumber {
	
	public int reverseNumber(int n) {
		int sign=(n<0)?-1:1;
		n=Math.abs(n);
		int rev=0;
		while(n!=0) {
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		return rev*sign;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ReverseNumber r1=new ReverseNumber();
		System.out.println("Enter Number ");
		int num=sc.nextInt();
		System.out.println("Reverse : "+r1.reverseNumber(num));
		

	}

}
