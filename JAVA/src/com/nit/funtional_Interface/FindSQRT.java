package com.nit.funtional_Interface;

import java.util.function.Function;

public class FindSQRT {

	public static void main(String[] args) {
		Function<Integer,Integer> f = (n) -> n*n;
		int num = 5;
		System.out.println("SQRT of  : "+num +" is : " +f.apply(num));

	}

}
