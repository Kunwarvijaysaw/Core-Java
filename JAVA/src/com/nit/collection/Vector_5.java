package com.nit.collection;

import java.util.Vector;

/*5. Write a Java program to remove all elements of Vector collection*/
public class Vector_5 {

	public static void main(String[] args) {
		Vector<Object> v=new Vector<Object>();
		v.add(10);
		v.add(true);
		v.add(5.5);
		System.out.println("Afte adding Element : "+v);
		
		System.out.println();
		v.removeAllElements();
		System.out.println("After Remove Element : "+v);
		

	}

}
