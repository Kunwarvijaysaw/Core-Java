package com.nit.array_Oct14;

import java.util.Arrays;

class MergeArray {
	public static void main(String[] args) {
		int a[]= {120, 250, 375};
		int b[]= {200, 340, 400};
		int c[]=new int[a.length+b.length];
		

		int ind=0;
		for (int i = 0; i < a.length; i++) {
			c[ind]=a[i];
			ind++;
		}
		for (int i = 0; i < b.length; i++) {
			c[ind]=b[i];
			ind++;
		}
		System.out.println(" Array of C : "+Arrays.toString(c));
		
		//sorting logic
				for(int i=0;i<c.length;i++) {
					for(int j=0;j<c.length-1-i;j++) {
						if(c[j]>c[j+1]) {
							int temp=c[j];
							c[j]=c[j+1];
							c[j+1]=temp;
						}
					}
					
				}
				System.out.println("Sorted array of C : "+Arrays.toString(c));
				
				
				int d[]=new int[a.length];
				for(int i=0;i<d.length;i++) {
					d[i]=a[i]+b[i];
				}
				System.out.println(" Array of D : "+Arrays.toString(d));
				
	}

}
