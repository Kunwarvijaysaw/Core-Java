package com.nit.collection;
/*7. Write a Java program to insert an item into Vector collection at the specified index*/
import java.util.Vector;

public class VectorIndex {

	public static void main(String[] args) {
		Vector<Object> v=new Vector<>();
		v.add(10);
		v.add(true);
		v.add(5.5);
		v.add('k');
		System.out.println("Vector Element : "+v);
		v.add(0, "KVS");
		System.out.println("After Adding Vector Element : "+v);

		
		
		

	}

}
