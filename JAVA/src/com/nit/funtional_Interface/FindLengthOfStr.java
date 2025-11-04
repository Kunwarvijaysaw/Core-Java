package com.nit.funtional_Interface;

import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;

public class FindLengthOfStr {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter your password");
//		String str = sc.nextLine();
		String str = "kuncavnsajvhuia";
		Function<String,Integer> f = (s) -> s.length();
		System.out.println("length of  : "+str +" is : " +f.apply(str));

	}

}
