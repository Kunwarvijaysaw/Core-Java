package com.nit.streamApi;

import java.util.List;
import java.util.stream.Collectors;

public class Test1 {

	public static void main(String[] args) {
		/*Filter even numbers from a list of integers.
		[1, 2, 3, 4, 5, 6]
		[2, 4, 6]*/
		System.out.println("====1.Even number=====");
		List<Integer> list= List.of(1,2,3,4,5,6);
		list.stream().filter(x->x%2==0).forEach(System.out::println);
		
		System.out.println("===4.Count the number of elements in a list.======");
		List<Integer> num= List.of(1,2,3,4,5,6);
		
	    System.out.println("size : " +num.size());
		
		System.out.println("\n=====3.Convert lower to Upper ======");
		List<String> name=List.of("kumar","Sk");
		name.stream()
		.map(String::toUpperCase)
		.forEach(System.out::println);
		
		
		System.out.println("\n2.Find all numbers greater than 50 from a list.====");
		List<Integer> list1= List.of(10,20,50,104,55,65);
		list1.stream().filter(x->x>50).forEach(System.out::println);
		
		
		System.out.println("5.Remove duplicate elements from a list using Stream API");
		
		List<Integer> lis = List.of(10, 20, 10, 30, 20, 40);

				lis.stream()
		    .distinct()
		    .forEach(System.out::println);
				/*List<Integer> uniqueList =
list.stream()
    .distinct()
    .collect(Collectors.toList());

System.out.println(uniqueList);*/

		
	}

}
