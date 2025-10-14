package com.nit.array_Oct_09;

import java.util.Scanner;

public class OccurrenceCountElements {
	public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int tc=0;
        for(int i=0;i<n;i++){
            int count=1;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count==2){
                tc++;
            }
        }
       
        System.out.println("Number of elements occurring more than once: "+tc);

    }


}
