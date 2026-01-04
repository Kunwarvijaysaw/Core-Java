package com.nit.array_Oct_09;

public class ArmStrongNo {

	public static void main(String[] args) {
		int arr[]= {153,204,271,1634};
		int c=0;
		for(int i=0;i<arr.length;i++) {
			int temp=arr[i];
			int count=0;
			double sum=0;
			//no digit find
			while(temp!=0) {
				count++;
				temp=temp/10;
			}
			//System.out.println(count);
			int tem=arr[i];
			while(tem!=0) {
				int rem=tem%10;
				sum=sum+Math.pow(rem, count);
				tem=tem/10;
			}
			if(arr[i]==sum) {
				c++;
				System.out.println("ArmStrong no : "+arr[i]);
			}
			
		}
		System.out.println("Total Armstrong No : "+c);

	}

}
