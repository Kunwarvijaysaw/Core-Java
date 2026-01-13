package LEETCODE;

public class MaximumSumOfSubArray {

	public static void main(String[] args) {
		int arr[]= {1,-5,2};
		int min=arr[0];
		int max=0;
		int total=0;
		for (int i = 0; i < arr.length; i++) {
			total+=arr[i];
			if(arr[i]<min) {
				min=arr[i];
			}
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println(min);
		System.out.println("Miximum Sum Array : "+(total-min));
		System.out.println("Minimum Sum Array : "+(total-max));
	}

}
