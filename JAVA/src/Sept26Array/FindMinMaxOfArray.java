package Sept26Array;

import java.util.Scanner;

public class FindMinMaxOfArray {
	
	public static int maxEle(int arr[]) {
		int max=arr[1];
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		return max;
		
	}
	
	public static int minEle(int arr[]) {
		int min=arr[1];
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		return min;
		
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
		System.out.println("Max : "+FindMinMaxOfArray.maxEle(arr));;
		System.out.println("Min : "+FindMinMaxOfArray.minEle(arr));;
		}
	}

}
