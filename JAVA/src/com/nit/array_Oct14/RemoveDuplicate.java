package com.nit.array_Oct14;

import java.util.Arrays;

class RemoveDuplicate {

	public static void main(String[] args) {
		int arr[]= {10,8,4,88,102,77,10,102,88};
		System.out.println("Before sorting Array : "+Arrays.toString(arr));
		//sorting for ascending order
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("After sorting Array : "+Arrays.toString(arr));
		System.out.println("After Removing Duplicate : ");
		//logic for remove duplication
		
		System.out.print(arr[0]);
		for(int i=1;i<arr.length;i++) {
			if(arr[i]!=arr[i-1]) {
				System.out.print(" "+arr[i]);
			}
		}

	}

}
