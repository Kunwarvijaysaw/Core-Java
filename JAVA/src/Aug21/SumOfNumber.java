package Aug21;

import java.util.Scanner;

class SumOfNumber {
	//static int n=10;
	public static void sumOfN(int n) {
		int sum=0;
		//int n=10;
		for(int i=1;i<=n;i++) {
			sum=sum+i;
		}
		System.out.println("Sum of 1 to "+n+" : "+sum);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n= sc.nextInt();
		sumOfN(n);

	}

}
