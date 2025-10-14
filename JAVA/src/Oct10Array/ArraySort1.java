package Oct10Array;

import java.util.Arrays;

class ArraySort1 {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};//output{4,5,1,2,3}
		int pos=2;
		int ind=0;
		for(int r=0;r<pos;r++) {
			int temp=arr[arr.length-1];
			for(int i=arr.length-1;i>0;i--) {
				arr[i]=arr[i-1];
			}
			arr[0]=temp;
		}
		System.out.println(Arrays.toString(arr));
//		for(int i=pos+1;i<arr.length;i++)
//		{
//			int temp=arr[i];
//			for(int j=i;j>ind;j--)
//			{
//				arr[j]=arr[j-1];
//			}
//			arr[ind++]=temp;
//		}
//		
//		
//		System.out.println(Arrays.toString(arr));
//		
		
//		int res[]=new int[arr.length];
//		int ind=0;
//		for(int i=pos+1;i<arr.length;i++) {
//			res[ind++]=arr[i];
//		}
//		for(int i=0;i<=pos;i++) {
//			res[ind++]=arr[i];
//			
//		}
//		
//		System.out.println(Arrays.toString(res));
//		
//		for(int i=pos;i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
//		}
//		for(int i=0;i<pos;i++) {
//			System.out.print(arr[i]+" ");
//		}
		
	}

}
