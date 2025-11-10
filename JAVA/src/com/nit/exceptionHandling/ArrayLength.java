package com.nit.exceptionHandling;

import java.util.Scanner;

public class ArrayLength {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter index");
	int i=sc.nextInt();
		int arr[]= {2,5,6,4};
		try {
			System.out.println("index "+i+" is : "+arr[i]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Access beyond the index of array . try again");
		}
	}

}
