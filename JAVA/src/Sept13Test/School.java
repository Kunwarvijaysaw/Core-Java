package Sept13Test;

import java.util.Scanner;

public class School {
	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Student Name: ");
		String name1=sc.nextLine();
		System.out.println("Enter Second Student Name: ");
		String name2=sc.nextLine();
		System.out.println("Enter School Name: ");
		String school=sc.nextLine();
		
		s1.setDetails(name1, school);
		s2.setDetails(name2, school);
		
		System.out.println("Student 1 Name: "+s1.name);
		System.out.println("Student 1 School: "+s1.schoolName);
		System.out.println();
		System.out.println("Student 2 Name: "+s2.name);
		System.out.println("Student 2 School: "+s2.schoolName);
		
		
		
				
	}

}
