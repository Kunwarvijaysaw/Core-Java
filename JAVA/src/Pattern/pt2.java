package Pattern;

class pt2 {
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n-2;i++) {//outer loop for row
			for(int j=1;j<=n;j++) {//inner loop for column
				System.out.print(j+" ");
			}
			System.out.println(" ");
		}
}
}