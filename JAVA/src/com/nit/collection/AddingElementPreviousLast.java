package com.nit.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AddingElementPreviousLast {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 ArrayList<Integer> a=new ArrayList<Integer>();
		 for(int i=1;i<=n;i++){
		 int value=sc.nextInt();
		 a.add(value);
		 }


		 int bn=sc.nextInt();
		 a.addFirst(bn);
		 int ln=sc.nextInt();
		 a.addLast(ln);
		 System.out.println("Updated ArrayList:");
		 Iterator<Integer> itr=a.iterator();
		 while(itr.hasNext()){
		 System.out.print(itr.next()+" ");
		 }

	}

}
