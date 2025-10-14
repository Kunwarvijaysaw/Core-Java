package com.nit.array_Oct14;
/*Q3. Find Frequency of Product Sales

To determine the popularity of products, the marketing team wants to know how many times
each product was sold.
Write a Java program to display the frequency of each product ID in the sales list.

Example:
Input:
salesData = [101, 102, 101, 103, 104, 102, 101, 104, 104]

Output:
101 → 3 times
102 → 2 times
103 → 1 time
104 → 3 times
*/
import java.util.Scanner;

public class OccuranceElement {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of Array ");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		System.out.println("Enter elements ");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		//find duplicate
		System.out.println("Frequency of Product Sales : ");
		for(int i=0;i<size;i++) {
			int count=1;
			int found=0;
			for(int j=0;j<size;j++) {
				if(arr[i]==arr[j] && i<j) {
					count++;
				}
				if(arr[i]==arr[j] && i>j) {
					found=1;
					break;
				}
			}
			if(count>=1&& found==0 ) {
				System.out.println(arr[i]+" Times "+count);
			}
			
		}
		

	}

}
