package com.nit.StringArray;

import java.util.Arrays;

public class RemoveDuplicateInString {

	public static void main(String[] args) {
		String name = "PROGRAMMING";
		String res = "";

		for (int i = 0; i < name.length(); i++) {
			int c = 1;
			for (int j = i + 1; j < name.length(); j++) {

				if (name.charAt(i) == name.charAt(j)) {
					c++;
				}
			}
			if (c == 1) {
				// System.out.print(name.charAt(i));
				res += name.charAt(i);
			}

		}
		System.out.println(res);

	}

}
/*
 import java.util.Arrays;

public class RemoveDuplicateInString {

	public static void main(String[] args) {
		String name= "RAMAADSFFG";
		char[] charArray = name.toCharArray();
		String res="";
		
		System.out.println(charArray);
		
		for (int i = 0; i < charArray.length-1; i++) {
			
				for (int j = i+1; j < charArray.length; j++) {
					
					if(charArray[i]==charArray[j] && charArray[i]!=' ')
					{
						charArray[j]=' ';
					}
				}
		}
		System.out.println(charArray);
		for (int i = 0; i < charArray.length; i++) {
			if(charArray[i]!=' ')
				res+=charArray[i];
		}
		
		System.out.println(res);

 */