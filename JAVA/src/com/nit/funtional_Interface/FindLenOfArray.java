package com.nit.funtional_Interface;
import java.util.Scanner;
//WAP to find the length of array using Function Interface
import java.util.function.Function;

public class FindLenOfArray {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int arr[]= {1,5,2,7,8,9};
		Function<int [],Integer> f =(n)->n.length;
		System.out.println("Array of length : " +f.apply(arr));
		

	}

}
