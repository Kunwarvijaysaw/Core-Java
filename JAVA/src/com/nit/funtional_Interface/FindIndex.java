package com.nit.funtional_Interface;

import java.util.Scanner;
import java.util.function.Function;

public class FindIndex {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ");
		String str=sc.nextLine();
		System.out.println("ii");
		int index=sc.nextInt();
		
		Function<String,Character> f = (s) -> s.charAt(index);

		System.out.println("index of  : "+str +" is : "+index+" is : " +f.apply(str));

	}

}
