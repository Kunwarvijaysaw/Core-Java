package Sept26Array;

import java.util.Arrays;
import java.util.Scanner;

class ReadAndPrintArray {
	public static void usingForLoop(int arr[]) { // this method will print array values using for loop


		System.out.println("----Using for loop----");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("=============================");
	}


	public static void usingForEachLoop(int arr[]) {// this method will print array values using for_each loop


		System.out.println("----Using for-each loop----");
		for (int x : arr) {
			System.out.print(x + " ");
		}
		System.out.println();
		System.out.println("=============================");
	}


	public static void usingArraysToString(int arr[]) {// this method will print array values using Arrays.toString()
														// method.
		System.out.println("----Using toString mehtod----");
		System.out.println(Arrays.toString(arr));
		System.out.println();
		System.out.println("=============================");
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
		ReadAndPrintArray.usingForLoop(arr);
		ReadAndPrintArray.usingForEachLoop(arr);
		ReadAndPrintArray.usingArraysToString(arr);
		}
	}

}
