package com.nit.funtional_Interface;
//WAP to check password length is grater than 8
import java.util.Scanner;
import java.util.function.Predicate;

public class FindLength {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your password");
		String str=sc.nextLine();
		Predicate  <String> p=(sentence)->str.length()>8;
		System.out.println("your password ["+str+"] length is grater then 8 : "+p.test(str));
	}

}
