package LEETCODE;

public class MaxSubArraySum {
	
	static int maxSubarraySum(int[] arr) {
		int res=arr[0];
		for (int i = 0; i < arr.length; i++) {
			
			int currentSum=0;
			
			for (int j = i; j < arr.length; j++) {
				currentSum=currentSum+arr[j];
				res=Math.max(res,currentSum);
			}
			
		}
		return res;
		
	}
	

	public static void main(String[] args) {
		int[] arr = {1,-5,3,-8,4};
        System.out.println(maxSubarraySum(arr));

	}

}
