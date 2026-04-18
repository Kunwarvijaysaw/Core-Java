package COLLECTION_MOCK;

import java.util.LinkedList;

public class LinkedListExample {
	 public static void main(String[] args) {

	        // Create LinkedList
	        LinkedList<Integer> list = new LinkedList<>();

	        // Adding elements
	        list.addFirst(10);   // add at beginning
	        list.addLast(20);    // add at end
	        list.addFirst(5);
	        list.addLast(30);

	        System.out.println("After Adding: " + list);

	        // Retrieving elements
	        int firstElement = list.getFirst();
	        int lastElement = list.getLast();

	        System.out.println("First Element: " + firstElement);
	        System.out.println("Last Element: " + lastElement);

	        // Removing elements
	        list.removeFirst();  // remove from beginning
	        list.removeLast();   // remove from end

	        System.out.println("After Removing: " + list);
	    }
	}