package COLLECTION_MOCK;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test1 {
	public static void main(String[] args) {
		
		List<String> list=new ArrayList<>();
		list.add("KVS");
		list.add("SM");
		list.add("SK");
		list.add("AKU");
		list.add("KD");
		
		System.out.println(list);
		
		System.out.println("\nUsing for loop");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
			System.out.println("\nUsing for Iterator");
			Iterator<String> itr=list.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			
			
			System.out.println("\nUsing for Each ");
			for( String s:list) {
				System.out.println(s);
			}
			
		
	}

	
}
