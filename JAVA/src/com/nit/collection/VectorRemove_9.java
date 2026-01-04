package com.nit.collection;

import java.util.Vector;

/*9. Write a Java program to remove a specified item from Vector collection*/
public class VectorRemove_9 {

	public static void main(String[] args) {
		Vector<Object> v=new Vector<>();
		v.add(10);
		v.add(true);
		v.add(5.5);
		v.add('k');
		System.out.println("Vector Element : "+v);
		v.remove(0);
		System.out.println("After Remove Vector Element : "+v);

	}

}
