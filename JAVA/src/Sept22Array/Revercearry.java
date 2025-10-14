package Sept22Array;

import java.util.Arrays;
import java.util.Scanner;

class Revercearry {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many number store in arry :");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter " + n + " elements:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
	int arr1[]=new int[n]; 
	
	for(int i=0;i<n;i++) {
		arr1[i]=arr[n-1-i];

	}

	System.out.println("Before reverce Array :"+Arrays.toString(arr));
	System.out.println("After reverce Array :"+Arrays.toString(arr1));
	}

}
