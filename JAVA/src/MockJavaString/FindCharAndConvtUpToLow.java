package MockJavaString;

public class FindCharAndConvtUpToLow {

	public static void main(String[] args) {
		String str="Kunwar Vijay Saw";
		char ch='a';
		
		char arr[]=str.toCharArray();
		
		for (int i = 0; i < arr.length; i++) {
			if(ch==arr[i]) {
				arr[i]=(char) (arr[i]-32);
			}
		}
		
		System.out.println(arr);

	}

}
