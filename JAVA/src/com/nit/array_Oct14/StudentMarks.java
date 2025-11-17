package com.nit.array_Oct14;

import java.util.Arrays;
import java.util.Scanner;

public class StudentMarks {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter No of Student");
		int size=sc.nextInt();
		int marks[]=new int[size];
		
		for (int i = 0; i < marks.length; i++) {
			System.out.println("Enter student "+(i+1)+" marks");
			marks[i]=sc.nextInt();
		}
		System.out.println("Marks table : "+Arrays.toString(marks));

	}

}
