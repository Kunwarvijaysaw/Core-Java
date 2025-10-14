package Sept26Array;

import java.util.Scanner;

class SumOfArray {
	
	public static int sumOfArray(int arr[]) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		return sum;
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
		
		
		System.out.println("Sum of Array : "+SumOfArray.sumOfArray(arr));
	}

	}

}
