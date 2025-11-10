/*Create a Java program that demonstrates the usage of the Predicate interface to test if a number is even or prime. Your task is to implement a method testPredicate in the NumberTester class that tests a given number against a provided predicate.

NumberTester Class(ELC):

In the main method:
Define two predicates:
isEven: Checks if a given number is even.
isPrime: Checks if a given number is prime.

Take an integer number by using Scanner class and verify whether the given number is even OR prime by using Predicate.

Test Cases:

Test Case 1:
Input: 13
Output:
Is 13 even? false
Is 13 prime? true

Test Case 2:
Input: 5
Output:
Is 5 even? false
Is 5 prime? true

Test Case 3:
Input: 20
Output:
Is 20 even? true
Is 20 prime? false

Examples
Example 1
Input:
5
Output:
Is 5 even? false
Is 5 prime? true
*/
package com.nit.predicate;

import java.util.Scanner;
import java.util.function.Predicate;

public class FindPrimeAndEven {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter Number");
	        int num=sc.nextInt();
	        Predicate <Integer> p=(n)->n%2==0;
	        System.out.println("Is "+num+" even? : "+p.test(num));
	        
	        Predicate <Integer> q=(n1)->{
	            int c=0;
	        
	        for(int i=1;i<=n1;i++){
	            if(n1%i==0){
	                c++;
	            }
	        }
	        if(c==2){
	           return true;
	        }
	        else {
	            return false;
	        }
	        
	        };
	        
	        System.out.println("Is "+num+" prime? : "+q.test(num));
	      


	}

}
