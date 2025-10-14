package Sept23Array;

import java.util.Scanner;

/*Wap to enret */
class LinearSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = { 10, 70, 80, 34, 87, 23, 47, 90, 65, 16, 29, 400, 10 };
		System.out.println("Enter key to Search : ");
		int key = sc.nextInt();
		boolean isFound = false;
		int position = 0;
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (key == arr[i]) {
				isFound = true;
				count++;
			}
		}
		if (isFound == true) {
			System.out.println("Element Available for  " + count + " times!");
		} else {
			System.err.println("Element Found not found! : ");
		}

	}

}
