package Sept26Array;

import java.util.Arrays;

public class max {
	public static void main(String[] args) {
		int arr[]= {77,5,99,12,105,777};
		int max=0;
		int min=0;
		// for max finding 
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		
		// for min find
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<max) {
				min=arr[i];
			}
		}
		
		// for array reverse
		int arr1[]=new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arr1[i]=arr[arr.length-1-i];
		}
		System.out.println("Reverse Array : "+Arrays.toString(arr1));//to.string method to used print in array 
		System.out.println("min : "+min);
		System.out.println("max : "+max);
	

}
}