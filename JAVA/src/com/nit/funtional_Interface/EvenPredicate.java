package com.nit.funtional_Interface;
/*WAP to  check if no is even or not by using predicate*/
import java.util.Scanner;
import java.util.function.Predicate;

public class EvenPredicate {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number to check wether it is even");
		int num=sc.nextInt();
		Predicate  <Integer> p=(n)->n%2==0;
		System.out.println(" "+p.test(num));
	}

}
