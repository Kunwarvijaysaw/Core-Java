package com.nit.streamApi;

import java.util.Scanner;

class Stu{
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public double getAverage(int... marks) {
		Scanner sc=new Scanner(System.in);
//		if(marks.length==0)
//		return null;
		double total=0.0;
		for(int m:marks) {
			total+=m;
		}
		return total/marks.length;
	}
}

public class Student {

	public static void main(String[] args) {
//		Stu s1=new Stu();
//		Optional<double> average=s1.getAverage(30,60,90);
//		System.out.println(average);

	}

}

