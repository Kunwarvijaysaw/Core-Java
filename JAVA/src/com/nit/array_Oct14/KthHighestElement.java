package com.nit.array_Oct14;

import java.util.Arrays;
import java.util.Scanner;

class KthHighestElement {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of Array ");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		System.out.println("Enter elements ");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		//sorting logic
		for(int i=0;i<size;i++) {
			for(int j=0;j<size-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			
		}
		System.out.println(Arrays.toString(arr));

		//logic for finding k highest element
		int k=3;
		int count=0;
		boolean found=false;
		for(int i=arr.length-1;i>=1;i--) {
			if(arr[i]>arr[i-1]) {
				count++;
			}
			if(k==count) {
				found=true;
				System.out.println(k+" highest is : "+arr[i]);
				System.exit(0);
			}
			
		}
		if(found==false) {
			System.out.println("Element not found");
		}

}
}