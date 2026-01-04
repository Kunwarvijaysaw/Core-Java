package com.nit.collection;

import java.util.Vector;

/*6. Write a Java program to create a clone of a Vector collection*/
public class VectorClone_6 {

	public static void main(String[] args) {
		Vector<Object> v=new Vector<>();
		v.add(10);
		v.add(true);
		v.add(5.5);
		v.add("kvs");
		v.add('k');
		Vector<Object> a=(Vector<Object>) v.clone();
		System.out.println(v);
		a.set(0, "efsfj");
		System.out.println(a);
		

	}

}
