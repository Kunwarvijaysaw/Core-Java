package com.nit.functionalInterfaceTest;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Test {

	public static void main(String[] args) {
		int age=19;
//		Predicate <Integer> p =(n)->n>=18;
//		System.out.println(p.test(age));
//		Function<Integer, Integer> f=(n)-> n*n;
//		System.out.println(f.apply(age));
//		Consumer<Integer> add=(n)->System.out.println(n+n);
//		add.accept(age);
		
		Supplier<Integer> add=() ->{if(age>=18) {
			return age;
		}else {
			System.out.println("Not");
			return -1;
		}
		
			
		}  ;
		System.out.println(add.get());
		
		
		

	}

}
