package Aug22;

public class SingleDigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=9875;
		int sum=0;
		

			
		while(n!=0) {
			int rem=n%10;
			sum=sum+rem;
			n=n/10;
			
			if(n==0 && sum>9) {
				System.out.println("Sum of number : "+sum);
				n=sum;
				sum=0;
			}
			
		}
		System.out.println("Sum of number : "+sum);
		
		
		
	}

}
