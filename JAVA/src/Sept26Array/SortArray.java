package Sept26Array;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
	
	public static int[] ascendingSort(int arr[]) {
		for(int i=0;i<arr.length-i-1;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
		
	}
	
	public static int[] descendingSort(int arr[]) {
		for(int i=0;i<arr.length-i-1;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]<arr[j+1]) {
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
		
		
	}
	public static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
		}
		System.out.println("");
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
		
		
		SortArray.ascendingSort(arr);
		System.out.println("Ascending Order : ");
		printArray(ascendingSort(arr));
		SortArray.descendingSort(arr);
		System.out.println("descending Order : ");
		printArray(descendingSort(arr));
	}

	}

}
