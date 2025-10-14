package Sept29Pattern;
/*
 Q4 . Write the program in Java to display the following pattern:
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1 
 * */
public class pattern4 {
	
	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			int k=1;
			for(int j=i;j<=5;j++) {
				System.out.print(k++ +" ");
			}
			System.out.println();
		}

	}

}
