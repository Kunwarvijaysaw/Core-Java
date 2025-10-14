package Sept29Pattern;

/*Q17. Write a program in Java to display the following pattern:
1
3 1
5 3 1
7 5 3 1
9 7 5 3 1
*/
public class Pattern16 {
	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			int c = i * 2 - 1;
			for (int j = 1; j <= i; j++) {
				System.out.print(c + " ");
				c -= 2;
			}

			System.out.println();

			//
		}

	}

}
