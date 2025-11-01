package com.nit.funtional_Interface;
//WAP to enter a number and check whether  positive or negative
import java.util.Scanner;
import java.util.function.Predicate;

public class CheckPositiveNegative {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number to check wether it is positive or not");
		int num=sc.nextInt();
		Predicate  <Integer> p=(n)->n>=0;
		System.out.println(num+" is positive "+p.test(num));

	}

}
