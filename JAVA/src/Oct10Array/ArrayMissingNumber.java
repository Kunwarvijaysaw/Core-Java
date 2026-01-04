package Oct10Array;
/*You are given an array containing n-1 unique integers in the range from 1 to n. There is exactly one integer missing. Write a method to find and return the missing integer.

Input:
nums = [1, 2, 4, 5, 6]
*/
import java.util.Scanner;

class ArrayMissingNumber {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int arr[]= {1,2,3,5};
//		int k=1;
//		
//		for(int i=0;i<arr.length;i++) {
//			if(k!=arr[i]) {
//				System.out.println("Missing Number is : "+k);
//				break;
//			}else {
//				k++;
//			}
//		}
		
		int[]arr= {1,2,4,5,6};
		int n=arr.length+1;
		int sum=n*(n+1)/2;
		System.out.println(sum);
		int actualSum=0;
		for(int i=0;i<arr.length;i++)
		{
			actualSum+=arr[i];
			
		}
		System.out.println(actualSum);
		System.out.println(sum-actualSum);
		
		
		

	}

}
