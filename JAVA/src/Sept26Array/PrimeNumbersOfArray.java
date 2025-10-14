package Sept26Array;

import java.util.Iterator;
import java.util.Scanner;

public class PrimeNumbersOfArray {
	
	 public static boolean isPrime(int n) {
		 int count=0;
		 for(int i=1;i<=n;i++) {
			 if(n%i==0)
				 count++;
			 
		 }
		 if(count==2)
			 return true;
		 return false;
	 }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Length : ");
		int n = sc.nextInt();

		if (n < 0) {
			System.out.println("Array size can't be  negative :");
			System.exit(0);
		} else if (n == 0) {
			System.out.println("array size is zero :");
			System.exit(0);
		} else {
		int arr[] = new int[n];
		System.out.println("Enter Array Element");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			boolean f=isPrime(arr[i]);
			if (f) {
				System.out.println(arr[i]);
			} 
		}
		
		
		
		
	}

	}

}
