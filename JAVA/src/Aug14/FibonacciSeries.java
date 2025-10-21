package Aug14;

import java.util.Scanner;

class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n = sc.nextInt();
		int a=0 , b=1;//0
		for(int i=0;i<n;i++) {
			System.out.print(a+" ");//0 1 1
			int next =a+b;//1 2
			a=b;//1 1 2
			b=next;//1 2 
		}

	}

}
