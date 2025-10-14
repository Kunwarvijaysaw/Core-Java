package Sept26Array;

import java.util.Scanner;

public class SearchElementInArray {
	 public static void searchElement(int arr[] , int ele) {
		 for(int i=0;i<arr.length;i++) {
			 if(arr[i]==ele) {
				 System.out.println(ele +" is present at index number "+i);
			 }
		 }
		 
	 }
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Length : ");
		int n = sc.nextInt();
		int arr[] = null;
		if (n < 0) {
			System.out.println("Array size can't be  negative :");
			System.exit(0);
		} else if (n == 0) {
			System.out.println("array size is zero :");
			System.exit(0);
		} else {
		 arr = new int[n];
		System.out.println("Enter Array Element");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		}
		System.out.println("Enter find element : ");
		int ele=sc.nextInt();
		SearchElementInArray.searchElement(arr, ele);
		
		

	}

}
