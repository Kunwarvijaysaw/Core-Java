package com.nit.funtional_Interface;
//WAP to find positive or negative using Consumer
import java.util.function.Consumer;

public class Number {

	public static void main(String[] args) {
		Consumer<Integer> c=(n)->{
									if(n>0) {
										System.out.println(n+" is positive ");
									}else {
										System.out.println(n+" is negative");
									}
		};
		c.accept(10);

	}

}
