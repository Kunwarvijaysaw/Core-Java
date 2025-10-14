package Pattern;
/*
1 1 1 1 1
2 2 2 2 2
3 3 3 3 3
4 4 4 4 4
5 5 5 5 5

*/
class pt3 {
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {//outer loop for row
			for(int j=1;j<=n;j++) {//inner loop for column
				System.out.print(i+" ");
			}
			System.out.println(" ");
		}
	}
}
