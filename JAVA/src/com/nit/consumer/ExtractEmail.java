/*"Username Extractor from Email
Real-World Scenario:
A login system displays the username based on the email ID.

Expectation:
Use Function<String, String> to extract the part before the @ in the email.
Sample Input: ""alice.smith@domain.com""
Expected Output: ""Username: alice.smith""

Hint: apply()"*/


package com.nit.consumer;

import java.util.Scanner;
import java.util.function.Function;

public class ExtractEmail {

	public static void main(String[] args) {
		Scanner sc=new  Scanner(System.in);
		System.out.println("Enter Email Id ");
		String emailId=sc.nextLine();
		Function<String, String> f=(e)->e.substring(0,e.indexOf('@') );
		System.out.println(f.apply(emailId));
	}

}
