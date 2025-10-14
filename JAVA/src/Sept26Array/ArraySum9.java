package Sept26Array;

import java.util.Scanner;

class ArraySum9 {
	
	public static int sum(int arr[]) {
		int sum=9;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
			if(arr[i]+arr[j]==sum) {
				System.out.println();	
			}
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array length : ");
		sc.close();
		
		

	}

}
