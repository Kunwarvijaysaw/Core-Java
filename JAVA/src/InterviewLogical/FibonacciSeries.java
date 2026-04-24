package InterviewLogical;

public class FibonacciSeries {
	public static void main(String[] args) {
		
	
	int n=5;
	int a=0;
	int b=1;
	
	for(int i=0;i<n;i++) {
		System.out.println(a+" ");
		int temp=a+b;
		a=b;
		b=temp;
				
	}
	}

}
