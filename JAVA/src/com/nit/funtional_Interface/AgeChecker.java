package com.nit.funtional_Interface;

import java.util.Scanner;

/*Q10. Check Age Eligibility
--------------------
Scenario:
Validate voting eligibility (age ≥ 18).

Task Requirements:
Create interface AgeCheck:
boolean check(int age);

Use lambda expression to print "Eligible" or "Not Eligible".*/


@FunctionalInterface
interface AgeCheck {
	boolean check(int age);
}

public class AgeChecker {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Age ");
		int ages=sc.nextInt();
		AgeCheck res=(age)->age>=18;
		System.out.println("You are Elegible for VoterId : "+res.check(ages));

	}

}
