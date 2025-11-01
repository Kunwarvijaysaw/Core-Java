package com.nit.funtional_Interface;
/*WAP to Check java is present or not */
import java.util.Scanner;
import java.util.function.Predicate;

public class TestString {

	public static void main(String[] args) {
		
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter the String to check wether it is Java ");
			String str=sc.nextLine();
			Predicate  <String> p=(sentence)->str.contains("java");
			System.out.println(p.test(str));
		}

	}


