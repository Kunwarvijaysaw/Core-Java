package Pattern;

public class pt5 {
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {//outer loop for row
			for(int j=n;j>=1;j++) {//inner loop for column
				System.out.print(j+" ");
			}
			System.out.println(" ");
		}
}
}
//}54321
//54321