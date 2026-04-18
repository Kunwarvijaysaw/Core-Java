package MockJava_Array;

import java.util.Arrays;

public class SiftZerosEndPosition {

	public static void main(String[] args) {
		int[] arr = { 0,10,0, 5,0, 20,0, 8, 25, 15 };
		
		for(int i=0;i<arr.length-1;i++) {
			
			if(arr[i]==0) {
				int temp=arr[i];
				for(int j=i;j<arr.length-1;j++) {
					arr[j]=arr[j+1];
				}
			
				arr[arr.length-1]=temp;
			}
			
			
		}
		
		System.out.println("After : "+Arrays.toString(arr));

	}

}
