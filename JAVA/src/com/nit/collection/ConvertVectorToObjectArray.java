package com.nit.collection;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class ConvertVectorToObjectArray {
	public static void main(String[]args){
		 Scanner sc=new Scanner(System.in);
	
		 Vector<String> v= new Vector<String>();
		 System.out.println("Enter Number of user ");
		 int n=sc.nextInt();
		 for(int i=1;i<=n;i++){
			 System.out.println("Enter value"+i);
		 String value=sc.next();
		 v.add(value);
		 }
		 System.out.println("Enter Switch Case No");
		 int k=sc.nextInt();
		 switch (k){
		 case 1:
		 System.out.println("Object Array Elements (Enhanced For Loop):");
		 v.forEach(x->System.out.println(x));
		 break;
		 case 2:
		 System.out.println("Vector Elements (Iterator):") ;
		 Iterator<String> itr=v.iterator();
		 while(itr.hasNext()){
		 System.out.println(itr.next());

		 }
		 break;
		 default :System.out.println("Exit");
		 }
		 }


}
