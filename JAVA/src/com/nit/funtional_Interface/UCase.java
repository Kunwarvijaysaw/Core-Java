package com.nit.funtional_Interface;
/*Q6. Convert Text to Uppercase
--------------------
Scenario:
A typing application converts the entered text into uppercase.

Task Requirements:
Create interface ConvertText:
String convert(String text);

Use lambda expression to convert input to uppercase.
*/

@FunctionalInterface
interface ConvertText{
	String convert(String text);
}
public class UCase {

	public static void main(String[] args) {
		ConvertText res=(str)->str.toUpperCase();
		System.out.println(res.convert("kvs"));

	}

}
