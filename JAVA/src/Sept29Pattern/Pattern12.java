package Sept29Pattern;
/*
 Q10 . Write the program in Java to display the following pattern:
9 9 9 9 9
7 7 7 7 7
5 5 5 5 5
3 3 3 3 3
1 1 1 1 1
*/
public class Pattern12 {
	public static void main(String[] args) {
		int k = 9;
		for (int i = 1; i <= 5; i++) {
			int m=k;
			for (int j = 1; j <= 5; j++) {
				System.out.print(m + " ");
				
			}
			k-=2;
			System.out.println();
		}

	}

}
