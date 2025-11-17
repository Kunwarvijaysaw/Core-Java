package com.nit.funtional_Interface;

import java.util.function.Function;

public class ConverLowerToUpper {

	public static void main(String[] args) {
		String s = "kunwar";
		Function<String,String> f = (str) -> str.toUpperCase();
		
		System.out.println("Upper Case  : "+s +" is : " +f.apply(s));

	}

}
