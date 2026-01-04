package com.nit.collection;

import java.util.Vector;

/*12. Write a Java program to add elements of a vector to other vector collection at the specified position
*/
public class Vector_12 {
	public static void main(String[] args) {
		
		Vector<Object> v=new Vector<>();
		v.add(17);
		v.add(true);
		v.add(8.8);
		v.add('h');
		System.out.println("Vector Element : "+v);
		Vector<Object> v2=new Vector<>();
		v2.addAll(v);
		System.out.println("Vector v2 Element : "+v2);
		v2.add(0, "KVS");
		
		System.out.println("Vector v2 Element : "+v2);
		
	}
}
