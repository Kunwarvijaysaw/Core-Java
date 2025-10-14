package Sept29Pattern;
/*
Q19. Write a program in Java to display the following pattern:
15 14 13 12 11
10 9 8 7
6 5 4
3 2
1
*/
public class Pattern18 {
	
	public static void main(String[] args) {
		int c =  5;
		int k=(c*(c+1)/2);
		for (int i = 5; i>=1; i--) {
			
			for (int j = 1; j <= i; j++) {
				System.out.printf("%4d",k);
				k--;
			}

			System.out.println();

			//
		}

	}

	

}
