package com.nit.funtional_Interface;
/*Q9. Count Length of a Word
--------------------
Scenario:
A word game counts how many letters a word contains.

Task Requirements:
Create interface WordLength:
int length(String word);

Use lambda expression to return and print the word length.
*/

@FunctionalInterface
interface WordLength {
	int length(String word);
}

public class FindLen {

	public static void main(String[] args) {
		WordLength res=(str)->str.length();
		System.out.println("Length is : "+res.length("KVS"));

	}

}
