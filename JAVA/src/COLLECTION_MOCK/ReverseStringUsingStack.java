package COLLECTION_MOCK;

import java.util.Stack;

public class ReverseStringUsingStack {
	public static void main(String[] args) {
		String input="Hello Madam";
		Stack<Character> stack=new Stack<>();
		
		for(int i=0;i<input.length();i++) {
			stack.push(input.charAt(i));
		}
		
		String rev=" ";
		while(!stack.empty()) {
			rev=rev+stack.pop();
		}
		
		System.out.println("Input : "+input);
		System.out.println("Reverse : "+rev);
		
		
	}

}
