package MockJava;

import java.util.Arrays;

public class UnionSortedArrays {
	public static void main(String[] args) {

		int arr1[] = { 1, 2, 4, 5, 6 };
		int arr2[] = { 2, 3, 5, 7 };

		int i = 0;
		int j = 0;

		while (i < arr1.length && j < arr2.length) {

			if (arr1[i] < arr2[j]) {
				System.out.print(arr1[i] + " ");
				i++;
			}

			else if (arr1[i] > arr2[j]) {
				System.out.print(arr2[j] + " ");
				j++;
			}

			else {
				System.out.print(arr1[i] + " ");
				i++;
				j++;
			}
		}

		while (i < arr1.length) {
			System.out.print(arr1[i] + " ");
			i++;
		}

		while (j < arr2.length) {
			System.out.print(arr2[j] + " ");
			j++;
		}
	}
}