package KVS;

public class REVSTR {
	public static void main(String[] args) {
		String str="Kunwar vijay saw";
		String word[]= str.split(" ");
		
		for(String words:word) {
			for (int i = words.length()-1;i>=0; i--) {
				System.out.print(words.charAt(i));
				
			}
			System.out.print(" ");
		}
	}

}
