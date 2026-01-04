package com.nit.collection;

import java.util.Vector;

/*3. Write a Java program to create a vector to store different types of objects*/
public class VectorDiffObj {

	public static void main(String[] args) {
		Vector v=new Vector<>();
		v.add(10);
		v.add(true);
		v.add(5.5);
		v.add("kvs");
		v.add('k');
		System.out.println(v);
		
	}

}
