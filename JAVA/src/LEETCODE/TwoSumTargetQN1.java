package LEETCODE;

import java.util.Arrays;

public class TwoSumTargetQN1 {
	public int[] TwoSum(int a[],int target) {
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;i<a.length;i++) {
				if(a[i]+a[j]==target) {
					return new int[] {i,j};
				}
			}
		}
		return new int[] {-1,-1};
		
	}
	

	public static void main(String[] args) {
		int arr[]= {4,5,3,2};
		int t=9;
		TwoSumTargetQN1 t1=new TwoSumTargetQN1();
		//int[] result=t1.TwoSum(arr, t);
		System.out.println("Index : "+Arrays.toString(t1.TwoSum(arr, t)));
		
		

	}

}
