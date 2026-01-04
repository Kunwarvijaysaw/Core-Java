package com.nit.collection;

import java.util.Vector;

/*11. Write a Java program to add elements of a Vector to other Vector collection*/
public class Vector_11 {
	public static void main(String[] args) {
		Vector<Object> v=new Vector<>();
		v.add(11);
		v.add(true);
		v.add(5.8);
		v.add('A');
		System.out.println("Vector Element : "+v);
		Vector<Object> v2=new Vector<>();
		v2.addAll(v);
		System.out.println("Vector v2 Element : "+v2);
		

	}
	

}
