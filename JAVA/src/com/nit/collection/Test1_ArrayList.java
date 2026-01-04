package com.nit.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Test1_ArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(15);
		list.add(20);
		list.add(25);
		list.add(30);
		list.add(35);
		list.addFirst(5);
		list.addLast(55);
	System.out.println(list);
	System.out.println("Print elemrnt via Iterator");
		Iterator<Integer> t=list.iterator();
		while(t.hasNext()) {
			System.out.print(t.next()+" ");
//			if(t.next()%2!=0) {
//				t.remove();
//			}
		}
	//	System.out.println(list);
		
	}

}
