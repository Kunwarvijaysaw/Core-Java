package Sept29Pattern;
/*
Q1 . Write a program in Java to display the following pattern:
1 
2 2 
3 3 3 
4 4 4 4 
5 5 5 5 5 
 * */
class Pattern1 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}

	}

}
