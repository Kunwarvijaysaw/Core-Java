package com.nit.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Test2_ArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(5);
		al.add(10);
		al.add(15);
		al.add(20);
		al.add(25);
		al.add(30);
		al.add(1,222);//add(index, element)
		al.addFirst(1111);//add First Element
		al.addLast(99999);// add last element
		al.remove(0);
		ArrayList<Integer> al2=new ArrayList<Integer>();
		al2.addAll(al);
		System.out.println("Array List Element : "+al);
		System.out.println("Array List Element2 : "+al2);
		//Iterator 
		System.out.println("========Print Element Using Iterator============");
		Iterator<Integer> itr=al.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		
		System.out.println("\n+++++++++++++++++++++++");
		al.forEach(n->System.out.println(n));
		
		System.out.println("containts : "+al.contains(99999));
	}

}
