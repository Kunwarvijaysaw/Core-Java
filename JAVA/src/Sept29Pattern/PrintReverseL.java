package Sept29Pattern;

public class PrintReverseL {

	public static void main(String[] args) {
		int n=10;
		for(int i=1;i<=n;i++) {
			if(i==n) {
				for(int j=1;j<=n;j++) {
					System.out.print("* ");
				}
			}else {
				for(int k=1;k<n;k++) {
				System.out.print("  ");
				}
				System.out.println("* ");
			}
		}

	}

}
