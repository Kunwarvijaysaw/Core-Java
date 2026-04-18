package COLLECTION_MOCK;

import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromeDeque {
	public static void main(String[] args) {
        String str = "madam";

        Deque<Character> dq = new ArrayDeque<>();

        for (char ch : str.toCharArray()) {
            dq.add(ch);
        }

        boolean palindrome = true;

        while (dq.size() > 1) {
            if (dq.removeFirst() != dq.removeLast()) {
                palindrome = false;
                break;
            }
        }

        System.out.println(palindrome ? "Palindrome" : "Not Palindrome");
    }
}