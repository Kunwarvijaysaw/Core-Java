package com.nit.streamApi;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
//		List<Integer> nums=List.of(1,2,3,4,5,6,7,8,9);
//		nums.stream().filter(x->x%2==0).forEach(System.out::println);
////		nums.stream().filter(x->x%2==0).toList();System.out.println(nums);
//		
//		
//		List<Integer> num1=Arrays.asList(7,8,5,6,2,3,11,44,77,55);
//		
		
		
		
//		// stream distinct()
//		List<Integer> num=List.of(1,2,3,2,4,3,5,1,6);
//		List<Integer>list=num.stream().distinct().toList();
//		System.out.println(list);
		
		// print duplicate element1
				List<Integer> num=List.of(1,2,3,2,4,3,5,1,6);
				Set<Integer> set=new HashSet<Integer>();
				List<Integer>list=num.stream().filter(x->!set.add(x)).toList();
			System.out.println(list);
				
	}

}
