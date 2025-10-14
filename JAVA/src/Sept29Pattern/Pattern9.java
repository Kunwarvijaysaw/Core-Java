package Sept29Pattern;

/*
Q11 . Write the program in Java to display the following pattern:
9
7 9
5 7 9
3 5 7 9
1 3 5 7 9 
 * */
public class Pattern9 {
	public static void main(String[] args) {
		int k = 9;
		for (int i = 1; i <= 5; i++) {
			int m=k;
			for (int j = 1; j <= i; j++) {
				System.out.print(m + " ");
				m+=2;
			}
			k-=2;
			System.out.println();
		}

	}

}
