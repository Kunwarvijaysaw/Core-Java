package Pattern;

/*
 * 
 5 10 15 20 25  
30 35 40 45 50  
55 60 65 70 75  
80 85 90 95 100 
 */

class pt6 {
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=5;j++) {
				
				System.out.print(n+" ");
				n=n+5;
			}
			System.out.println(" ");
		}

}
}