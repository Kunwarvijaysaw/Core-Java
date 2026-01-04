package com.nit.collection;

import java.util.ArrayList;
import java.util.LinkedList;

/*2. Customer Cart (Use LinkedList)
Each customer has a cart implemented as a LinkedList.

Functions:
Add product to cart
Remove product
Move recently viewed products to cart
Display cart items in order

Why LinkedList?
Efficient insertion/removal during cart modifications.*/
public class CustomerCard {
	LinkedList<ArrayList_1>list=new LinkedList<ArrayList_1>();
	
	public void addProduct(ArrayList<ArrayList_1> a)
	{
		
		
		
		
	}
	public static void main(String[] args) {
	
		
		LinkedList<Integer> l=new LinkedList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		System.out.println("After Adding Element : "+l);
		l.remove(3);
		System.out.println("After Removing Element : "+l);
		

	}

}
