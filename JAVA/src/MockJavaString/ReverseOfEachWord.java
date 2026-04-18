package MockJavaString;

public class ReverseOfEachWord {

	public static void main(String[] args) {
		String str="Hello KVSM Lovers";
		String word[]=str.split(" ");
		
		for(int i=0;i<word.length;i++) {
			for(int j=word[i].length()-1;j>=0;j--) {
				System.out.print(word[i].charAt(j));
			}
			System.out.print(" ");
		}

	}

}
