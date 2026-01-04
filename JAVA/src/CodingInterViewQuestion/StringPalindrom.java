package CodingInterViewQuestion;

public class StringPalindrom {

	public static void main(String[] args) {
		String str="madam";
		String s1="";
		int c=0;
		for(int i=str.length()-1;i>=0;i--) {
			c++;
			s1=s1+str.charAt(i);
		}
		System.out.println(c);
		if(str.equals(s1)) {
			System.out.println("Palindrome.............!");
		}else {
			System.out.println("Not Palindrome....!");
		}
	}

}
