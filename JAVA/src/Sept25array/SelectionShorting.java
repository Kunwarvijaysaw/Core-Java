package Sept25array;

import java.util.Arrays;

public class SelectionShorting {
	public static void main(String[] args) {
		int arr[]= {88,5,77,21,18,55};
		for(int i=0;i<arr.length-1;i++) {
			int minInd=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[minInd]) {
					minInd=j;
				}
			}
			int temp=arr[minInd];
			arr[minInd]=arr[i];
			arr[i]=temp;
			
		}
		System.out.println(Arrays.toString(arr));
	}

}
