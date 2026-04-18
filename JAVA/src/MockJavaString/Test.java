package MockJavaString;
//1.Find the first non-repeated character in a string.
public class Test {

	public static void main(String[] args) {
		String str="Programm";
		
		for (int i = 0; i < str.length(); i++) {
			int c=0;
			
			for(int j=0;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					c++;
				}
				
			}
			if(c==1) {
				System.out.println(str.charAt(i));
				break;
			}
		}

	}

}
