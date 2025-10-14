package Sept29Pattern;
/*
Q13 . Write a program in Java to display the following pattern:
1
2   3
4   5   6
7   8   9   10
11 12 13 14 15 
 * */
public class Pattern13 {
	public static void main(String[] args) {
		int n=5;
		int k=1;
		for(int i=1;i<=n;i++) {
			for(int j=i;j>=1;j--) {
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
//			k++;
		}

	}
	

}
