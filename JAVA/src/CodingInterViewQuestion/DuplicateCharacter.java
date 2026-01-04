package CodingInterViewQuestion;

public class DuplicateCharacter {
	public static void main(String[] args) {
		String s = "manmaatr";


		// find duplicate
				System.out.println("Duplicate element is : ");
				for (int i = 0; i < s.length(); i++) {
					int count = 1;
					int found = 0;
					for (int j = 0; j <s.length(); j++) {
						if (s.charAt(i) == s.charAt(j) && i<j) {
							count++;
						}
						if (s.charAt(i) == s.charAt(j) && i>j) {
							found = 1;
							break;
						}
					}
					if (count > 1 && found == 0) {
						System.out.print(s.charAt(i) + " ");
					}

				}
	}

}
