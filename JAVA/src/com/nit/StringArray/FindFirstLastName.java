package com.nit.StringArray;

import java.util.Arrays;

class FindFirstLastName {

	public static void main(String[] args) {
		// Single name
		String name = "Kunwar Vijay Saw";
		String res = name.split(" ")[0];
		System.out.println("First Name : " + res);
		String[] p = name.split(" ");
		System.out.println("Last name : " + p[p.length - 1]);

		System.out.println("===============================");
		
		// Find first & last name in the array
		String[] names = { "kunwar vijay saw", "kumar raj", "aditya anand" };
		System.out.println(Arrays.toString(names) + "\n");
		System.out.println("First Name:");
		for (String n : names) {
			String fs = n.split(" ")[0];
			System.out.println(fs);
		}
		
		System.out.println("\n");
		System.out.println("Last Name:");
		for (String n : names) {
			String[] parts = n.split(" ");
			String ls = parts[parts.length - 1];
			System.out.println(ls);
		}
	}

}
