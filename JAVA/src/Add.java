
public class Add {
	public static void main(String args[]) {
		int n=125;
		int t=n;
		int rev=0;
		while(t!=0) {
			int r=t%10;
			rev=rev*10+r;
			t=t/10;
		}
			System.out.println(rev);	
	}


}
