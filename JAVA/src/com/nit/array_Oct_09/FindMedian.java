package com.nit.array_Oct_09;

import java.util.Scanner;

public class FindMedian {
	public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter Element : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        double total=0;
        for(int i=0;i<n;i++){
            total+=arr[i];
        }
        System.out.println("Sum : "+total);
        double mean=total/n;
        System.out.println("Mean is : "+mean);
        double median=0;
        if(arr.length %2==0){
            median=(arr[arr.length/2-1] +arr[ arr.length/2])/2.0;
            System.out.println("Median: "+median);
        }
        else{
            median=arr[arr.length/2];
                 System.out.println("Median: "+median);
        }
        

    }
}



