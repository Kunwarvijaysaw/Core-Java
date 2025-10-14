package Sept27Array;

import java.util.Arrays;
import java.util.Scanner;

class ArrayElement {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	System.out.println("Enter Array length : ");
	int n=sc.nextInt();
	System.out.println("Enter Array element :");
	int arr[]=new int[n];
	for (int i = 0; i < n; i++) {
		arr[i]=sc.nextInt();		
	}
	System.out.println(Arrays.toString(arr));
	}

}
