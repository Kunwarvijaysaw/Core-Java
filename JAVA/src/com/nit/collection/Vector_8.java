package com.nit.collection;

import java.util.Vector;

/*8. Write a Java program to replace an item into Vector collection at the specified index*/
public class Vector_8 {

	public static void main(String[] args) {
		Vector<Object> v=new Vector<>();
		v.add(10);
		v.add(true);
		v.add(5.5);
		v.add('k');
		System.out.println("Vector Element : "+v);
		v.set(0, 12);
		System.out.println("After Replace Vector Element : "+v);

	}

}
