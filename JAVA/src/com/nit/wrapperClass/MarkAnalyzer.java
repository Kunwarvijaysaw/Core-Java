/*Question 3: Student Marks Analyzer (Auto-boxing / Unboxing)
----------------------------------------------------------
Problem Statement:
A student’s three subject marks are received as int values. Use wrapper classes to demonstrate auto-boxing and unboxing, and calculate average.

Class Name: MarkAnalyzer

Instance Variables:
private Integer m1, m2, m3;

Constructor:
public MarkAnalyzer(int m1, int m2, int m3)

Methods:
public double average() — Calculates and returns average using unboxing.

Input Format:
m1 m2 m3

Output Format:
Average: <average value>

Sample Test Cases:
Input: 80 90 100 → Average: 90.0
Input: 50 60 70 → Average: 60.0
Input: 0 0 0 → Average: 0.0
Input: 75 85 65 → Average: 75.0*/

package com.nit.wrapperClass;

import java.util.Scanner;

public class MarkAnalyzer {
	private Integer marks1;
	private Integer marks2;
	private Integer marks3;

	public MarkAnalyzer(int marks1, int marks2, int marks3) {
		super();
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
	}

	public double average() {
		Double avg = (marks1 + marks2 + marks3) / 3.0;
		double av = avg;
		return av;
	}

	@Override
	public String toString() {
		return "marks1=" + marks1 + ", marks2=" + marks2 + ", marks3=" + marks3 + "\nAverage : " + average();

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Marks1");
		int marks1 = sc.nextInt();
		System.out.println("Enter Marks2");
		int marks2 = sc.nextInt();
		System.out.println("Enter Marks3");
		int marks3 = sc.nextInt();

		MarkAnalyzer m1 = new MarkAnalyzer(marks1, marks2, marks3);
		System.out.println(m1.toString());

	}

}
