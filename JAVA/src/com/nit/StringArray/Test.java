package com.nit.StringArray;

public class Test {

	public static void main(String[] args) {
		String name = "MR AMAR KUMAR UPADHYAY";
		//first name , last name ,middle name
		String[] split = name.split(" ");
		String fname=split[0];
		String Mname=split[1];
		String sname=split[2];
		System.out.println("First Name ="+fname);
		System.out.println("Middle Name ="+Mname);
		System.out.println("surname Name ="+sname);
		
	}

}
