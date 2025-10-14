package Sept29Pattern;
/*
Q5 . Write a program in Java to display the following pattern:
5 4 3 2 1
5 4 3 2
5 4 3
5 4
5
*/
public class Pattern5 {
	
public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			int k=5;
			for(int j=i;j<=5;j++) {
				System.out.print(k-- +" ");
			}
			System.out.println();
		}

	}

}
