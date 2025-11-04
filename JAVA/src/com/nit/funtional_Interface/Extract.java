package com.nit.funtional_Interface;

import java.util.Scanner;
import java.util.function.Function;

public class Extract {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter UPI Id ");
		String upi=sc.nextLine();

		
		Function<String,String> f = (s) -> s.substring(s.indexOf('@'));

		System.out.println("Domain for upi entered:" +f.apply(upi));

	}

}
