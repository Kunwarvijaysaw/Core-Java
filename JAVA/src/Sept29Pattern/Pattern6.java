package Sept29Pattern;
/*
 Q6 . Write the program in Java to display the following pattern:
1 3 5 7 9
1 3 5 7
1 3 5
1 3
1
 * */
public class Pattern6 {
	
public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			int k=1;
			for(int j=i;j<=5;j++) {
				System.out.print(k +" ");
				k=k+2;
			}
			System.out.println();
		}

	}

}
