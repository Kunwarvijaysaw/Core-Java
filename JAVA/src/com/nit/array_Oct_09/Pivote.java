package com.nit.array_Oct_09;

public class Pivote {

	public static void main(String[] args) {
		int arr[] = { 4, 5, 2, 1, 8 };
		for (int i = 0; i < arr.length; i++) {

			int leftSum = 0;
			for (int l = 0; l < i; l++) {
				leftSum += arr[l];
			}

			int rightSum = 0;
			for (int r = i + 1; r < arr.length; r++) {
				rightSum += arr[r];
			}

			if (leftSum == rightSum) {
				System.out.println("Pivot index: " + i + " (Element: " + arr[i] + ")");
				return; 
			}
		}

		System.out.println("No pivot index found in this Array...........!");
	}

}
