package com.nit.exceptionHandling;

import java.util.Scanner;

public class Calculator2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter first Number ");
        int a=sc.nextInt();
        System.out.print("Enter Second Number ");
        int b=sc.nextInt();
        System.out.print("Enter Operator");
        String op=sc.next();
        int res;
        
        try {
        switch (op) {
        case "+" -> res=  a+b;
        case "-" -> res=  a-b;
        case "*" -> res=  a*b;
        case "/" -> res=  a/b;
        default -> throw new IllegalArgumentException("Unknown Operator");
        }
        System.out.println(res);
        }catch(IllegalArgumentException e) {
        	System.out.println(e.getMessage());
        }
        catch(ArithmeticException e) {
        	System.out.println("Can not divide by zero");
        }

	}

}
