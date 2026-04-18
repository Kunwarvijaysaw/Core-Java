package COLLECTION_MOCK;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEnumerationExample {
	
	public static void main(String[] args) {
		Vector <Integer> vector=new Vector<>();
		vector.add(10);
		vector.add(20);
		vector.add(30);
		vector.add(40);
		vector.add(50);
		vector.add(60);
		
		Enumeration<Integer> elements=vector.elements();
		
		   // Iterate using Enumeration
        System.out.print("Vector elements are : ");
		while(elements.hasMoreElements()) {
			System.out.print(elements.nextElement()+" ");
		}
	}

}
