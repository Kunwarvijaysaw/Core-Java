/*Q6. Reverse Character Access – Text Analyzer

Scenario:
A text analyzer allows users to get a character from end using
index (0 = last char, 1 = second last, etc.)

Requirements:
Input a string.
Input a reverse index.
Convert index using: charIndex = string.length() - reverseIndex - 1
If invalid, catch exception and show:

"Invalid reverse index. Please try again."*/

package com.nit.exceptionHandling;

import java.util.Scanner;

public class ReverseCharacter {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Password");
		String pass=sc.nextLine();//Airplane
		System.out.println("Enter index");
		int index=sc.nextInt();
//		char res = (char) (pass.length() - index - 1);
		
		
		System.out.println((char) (pass.length() - index - 1));
		
//		String res="";
//		
//		for(int i=pass.length()-1;i>=0;i--) {
//			char charAt = pass.charAt(i);
//			res +=charAt;
//		}
//		System.out.println("Reverse :"+res);
//		System.out.println("Enter index");
//		int index=sc.nextInt();
//		System.out.println("index "+index+" element is : "+res.charAt(index));

	}

}
