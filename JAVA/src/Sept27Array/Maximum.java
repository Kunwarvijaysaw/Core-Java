package Sept27Array;

import java.util.Arrays;
import java.util.Scanner;

public class Maximum {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	System.out.println("Enter Array length : ");
	int n=sc.nextInt();
	System.out.println("Enter Array element :");
	int arr[]=new int[n];
	for (int i = 0; i < n; i++) {
		arr[i]=sc.nextInt();		
	}
	
	// for max
	int secM = 0;
	int max=arr[0];
	for (int i = 1; i < n; i++) {
		if(arr[i]>max) {
			max=arr[i];
		}
		if(secM<arr[i] && secM<max)
		{
			secM=arr[i];
		}
		
	}
	
	// for min
	int secMin=Integer.MAX_VALUE;
	int min=arr[0];
	for (int i = 1; i < n; i++) {
		
		if(secMin>arr[i] && secMin>min)
		{
			secMin=arr[i];
		}
		if(arr[i]<min) {
			min=arr[i];
		}
	}
	
	
	// for sum of the array
	int sum=0;
	for (int i = 0; i < n; i++) {
		sum=sum+arr[i];
	}
	
	
	// print statement
	System.out.println("Max : "+max);
	
	System.out.println("Min : "+min);
	System.out.println("Sum : "+sum);
	System.out.println("SecMax : "+secM);
	System.out.println("SecMin : "+secMin);

}
}