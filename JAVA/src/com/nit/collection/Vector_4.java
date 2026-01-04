package com.nit.collection;
/*4. Write a Java program to count the items of a Vector collection*/
import java.util.Vector;

public class Vector_4 {

	public static void main(String[] args) {
		Vector<Object> v=new Vector<>();
		v.add(10);
		v.add(5.5);
		v.add(true);
		System.out.println("Size of the vector : "+v.size());
		
	}

}
