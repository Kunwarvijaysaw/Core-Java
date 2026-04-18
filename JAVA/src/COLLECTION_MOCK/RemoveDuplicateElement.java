package COLLECTION_MOCK;
//1) Write a Java program to remove duplicate elements from a List.

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateElement {

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(2);
		list.add(4);
		list.add(5);
		list.add(5);
		list.add(3);
		
		System.out.println("After Removing Duplicate : \n"+list);
		
		List<Integer> uniqueList=new ArrayList<>();
		for(Integer element :list) {
			if(!uniqueList.contains(element)) {
				uniqueList.add(element);
			}
		}
		
		System.out.println("\nAfter Removing Duplicate : \n"+uniqueList);

	}

}
