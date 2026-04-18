package MockJavaString;

public class ConvertUpperToLowerAndReverse {

	public static void main(String[] args) {
		String str = "Java";
		String upper = "";
		String lower = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			// Convert to uppercase
			if (ch >= 'a' && ch <= 'z') {
				upper += (char) (ch - 32);
			} else {
				upper += ch;
			}

			// Convert to lowercase
			if (ch >= 'A' && ch <= 'Z') {
				lower += (char) (ch + 32);
			} else {
				lower += ch;
			}
		}

		System.out.println("Uppercase: " + upper);
		System.out.println("Lowercase: " + lower);
	}
}