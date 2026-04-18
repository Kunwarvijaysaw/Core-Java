package MockJavaString;

public class SplitWord {

	public static void main(String[] args) {
		String str = "Java is very powerful";
		int count = 0;

		str = str.trim();

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
				count++;
			}
		}

		// Add 1 for last word
		System.out.println("Number of words: " + (count + 1));
		
//		String[] words = str.trim().split("\\s+");  // Split by spaces
//        System.out.println("Number of words: " + words.length);
	}
}