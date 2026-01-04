package CodingInterViewQuestion;

import com.nit.multiThreading.ChangeUpperToLower;

public class StringVowel {

	public static void main(String[] args) {
		String str="infosys";
		int vowel=0;
		int cons=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.toUpperCase().charAt(i);
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
				vowel++;
				
			}else {
				cons++;
			}
		}
		
		System.out.println("Vowel : "+vowel);
		System.out.println("Consonent : "+cons);

	}

}
