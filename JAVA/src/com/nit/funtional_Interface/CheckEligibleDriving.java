package com.nit.funtional_Interface;
/*WAP to check a person is eligible for DL or not*/
import java.util.Scanner;
import java.util.function.Predicate;

class CheckEligibleDriving {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		Predicate<Integer> p = (n) ->age>=18;
		System.out.println("Eligible for DL : "+p.test(age));


	}

}

