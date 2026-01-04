package LEETCODE;

public class MedianOfTwoSortedArraysQN4 {
	
	public double findMedianSortedArrays(int[] a, int[] b) {
		int n=a.length;
		int m=b.length;
		int arr[]=new int[n+m];
		int i=0;
		int j=0;
		int k=0;
		while(i<n && j<m) {
			if(a[i]<b[i]) {
				arr[k++]=a[i++];
			}else {
				arr[k++]=b[j++];
			}
		}
		while (i < n) {
			arr[k++] = a[i++];}
        while (j < m) {arr[k++] = b[j++];}
		int len=arr.length;
		if(len%2==0) {
			return (arr[len/2-1]+arr[len/2])/2.0;
		}else {
			return(arr[len/2]);
		}
		
	}

	public static void main(String[] args) {
		MedianOfTwoSortedArraysQN4 m=new MedianOfTwoSortedArraysQN4();
		
		int a[]= {1,2};
		int b[]= {3,4};
		double result=m.findMedianSortedArrays(a, b);
		System.out.println("Median : "+result);
		

	}

}
