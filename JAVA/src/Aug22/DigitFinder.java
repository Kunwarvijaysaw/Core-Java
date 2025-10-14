package Aug22;

import java.util.Scanner;

class DigitFinder {
	public static void findDigits(int n) {
		int temp=n;
		int rev=0;
		while(temp!=0) {
			int rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
			
			
			
		}
		//System.out.println("Reverse number : "+rev);
		System.out.print("Digits Are : ");
		
		
		while(rev!=0) {
			int rem=rev%10;
			System.out.print(rem+" ");
			
			rev=rev/10;
		}
		
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n=sc.nextInt();
		findDigits(n);
		

	}

}
