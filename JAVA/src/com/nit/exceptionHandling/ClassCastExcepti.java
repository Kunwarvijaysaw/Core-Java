package com.nit.exceptionHandling;

public class ClassCastExcepti {

	public static void main(String[] args) {
		Object obj = new String("test");
		try
		{
		Integer i = (Integer) obj;
		}
		catch (ClassCastException e) {
			System.err.println("we found ClassCastException");
		}
	}

}
