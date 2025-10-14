package Sept26Array;

import java.util.Arrays;
import java.util.Scanner;

class ReverseOfArray {
	
	 public static void reverseArray(int arr[]) {
		 int arr1[]=new int[arr.length]; 
		 for(int i=0;i<arr.length;i++) {
			 arr1[i]=arr[arr.length-1-i];
		 }
//		 System.out.println(Arrays.toString(arr1));
		 System.out.println("Reverse Array : ");
		 for(int i=0;i<arr1.length;i++) {
			 System.out.print(arr1[i]+" ");
		 }
	 }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Length : ");
		int n = sc.nextInt();

		if (n < 0) {
			System.out.println("Invalid size");
			System.exit(0);
		} else if (n == 0) {
			System.out.println("array size is zero");
			System.exit(0);
		} else {
		int arr[] = new int[n];
		System.out.println("Enter Array Element");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		ReverseOfArray.reverseArray(arr);
	}

}
}