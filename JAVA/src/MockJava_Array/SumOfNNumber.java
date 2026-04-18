package MockJava_Array;

public class SumOfNNumber {

	public static void main(String[] args) {
		int n=5;
		int arr[]= {1,2,3,5};
		int acSum=n*(n+1)/2;
		int sum=0;
		
		for( int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		int diff=acSum-sum;
		System.out.println(acSum);
		System.out.println(sum);
	}

}