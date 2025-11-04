package com.nit.funtional_Interface;

import java.util.Scanner;
import java.util.function.Predicate;

class PrimeOrNot {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter any Number ");
		int num=sc.nextInt();
		 Predicate<Integer> isPrime = (n) -> {
	            if (n <= 1) return false;
	            for (int i = 2; i <= Math.sqrt(n); i++) {
	                if (n % i == 0)
	                    return false;
	            }
	            return true;
	        };

	        System.out.println("Number [" + num + "] is Prime: " + isPrime.test(num));
		

	}

}
