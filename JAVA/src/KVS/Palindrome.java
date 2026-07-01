package KVS;

public class Palindrome {

	public static void main(String[] args) {

		String str = "madam";
		int l = 0;
		int r = str.length() - 1;
		boolean isPalindrome = true;
		while (l < r) {
			if (str.charAt(l) != str.charAt(r)) {
				isPalindrome = false;
				break;
			}
			l++;
			r--;
		}

		if (isPalindrome) {
			System.out.println("Palindrome : " + str);
		} else {
			System.out.println("not palindrome.......................!");
		}

	}

}
