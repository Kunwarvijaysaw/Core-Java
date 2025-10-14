package com.nit.array_Oct14;
import java.util.Arrays;
/*Q2. Update Discontinued Product Codes
When a product is discontinued and reintroduced under a new code, you need to update 
all its occurrences in the system.
Write a Java method named modifyArrayElement that replaces every occurrence of oldProductCode with newProductCode.

Example:
Input:
productCodes = [501, 502, 503, 504, 505, 502, 503]
oldProductCode = 503
newProductCode = 999

Output:
Updated Product Codes: [501, 502, 999, 504, 505, 502, 999]*/
import java.util.Scanner;

class UpdateElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of Array ");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		System.out.println("Enter elements ");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter Old Value : ");
		int oldValue=sc.nextInt();
		System.out.println("Enter new value : ");
		int newValue=sc.nextInt();
		for(int i=0;i<size;i++) {
			if(arr[i]==oldValue) {
				arr[i]=newValue;
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
