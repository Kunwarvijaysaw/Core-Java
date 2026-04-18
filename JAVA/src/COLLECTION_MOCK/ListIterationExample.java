package COLLECTION_MOCK;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIterationExample {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("Java");
		list.add("C++");
		list.add("SPRING");
		list.add("ORACLE");
		list.add("REACT");
		
		//1.Using for Loop
		System.out.println("Print using for loop");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
//		System.out.println("\n\n");
//		
//		//2.Using Iterator
//		System.out.println("Print using Iterator");
//		Iterator<String> itr=list.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//		
//		
//		System.out.println("\n\n");
//		//3.Using For each method
//		System.out.println("Print using forEach method");
//		for(String element:list) {
//			System.out.println(element);
//		}
	}

}
