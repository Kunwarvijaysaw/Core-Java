package com.nit.array_Oct14;
/*Q1. Detect Duplicate Product IDs
The company occasionally receives duplicate product entries due to synchronization 
errors between branch servers.
Write a Java program to print all duplicate product IDs from a given product list.

Example:

Input:
productIDs = [101, 205, 101, 310, 101, 420, 605, 205, 518, 420]

Output:
Duplicate Product IDs: 101 205 420*/

import java.util.Arrays;
import java.util.Scanner;

class FindDuplicateElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of Array ");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		System.out.println("Enter elements ");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		//find duplicate
		System.out.println("Duplicate element is : ");
		for(int i=0;i<size;i++) {
			int count=1;
			int found=0;
			for(int j=0;j<size;j++) {
				if(arr[i]==arr[j] && i<j) {
					count++;
				}
				if(arr[i]==arr[j] && i>j) {
					found=1;
					break;
				}
			}
			if(count>1 && found==0) {
				System.out.print(arr[i]+" ");
			}
			
		}
		

	}

}
