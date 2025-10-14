package Sept26Array;

import java.util.Scanner;

class SecondSmallLargeEleOfArray {
	
	public static int secondSmallestEle(int arr[]) {
		int large = 0;
		for (int i = 0; i < arr.length; i++) 
			 {
				if(arr[i]>large)
				{
					large = arr[i];
				}
			 }
		int secSmall=0;
		int small=large;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<small) {
				secSmall=small;
				small=arr[i];
			}
		}
		return secSmall;
		
		
		
	}
	
	 public static int secondLargestEle(int arr[]) //1,2,3,4,5,6,7,8
	 {
//		 int large = 0;
		 int secLarge = 0;
//		 for (int i = 0; i < arr.length; i++) 
//		 {
//			if(arr[i]>large)
//			{
//				secLarge = large;
//				large = arr[i];
//			}
//		 }
		 for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]<arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		 for (int i = 1; i < arr.length; i++) {
			 if(arr[0]>arr[i]) {
		 secLarge = arr[i];
			 break;
		 }
		 }
		return secLarge;
	 }
	
	
	

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Array Length : ");
//		int n = sc.nextInt();
//
//		if (n < 0) {
//			System.out.println("Array size can't be  negative :");
//			System.exit(0);
//		} else if (n == 0) {
//			System.out.println("array size is zero :");
//			System.exit(0);
//		} else {
//		int arr[] = new int[n];
//		System.out.println("Enter Array Element");
//		for (int i = 0; i < n; i++) {
//			arr[i] = sc.nextInt();
//		}
		int arr[] =  {9,1,1,2,3,4,5,6,7,8,8};
		System.out.println("Largest Elements is : "+secondLargestEle(arr));
		System.out.println("Small : "+secondSmallestEle(arr));
		
		}

	}


