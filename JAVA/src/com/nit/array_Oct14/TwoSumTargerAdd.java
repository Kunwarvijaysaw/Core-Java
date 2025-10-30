package com.nit.array_Oct14;

public class TwoSumTargerAdd {

	public static void main(String[] args) {
		int arr[]= {2,11,7,15};
		int target=9;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==target) {
					System.out.println((i)+","+(j));
					
					
				}
			}
		}

	}

}
