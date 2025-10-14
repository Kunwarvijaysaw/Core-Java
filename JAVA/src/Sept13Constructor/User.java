package Sept13Constructor;

import java.util.Scanner;

public class User {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name : ");
		String name=sc.nextLine();
		System.out.println("Enter Department : ");
		String department=sc.nextLine();
		System.out.println("Enter Roll no : ");
		int rollNo=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name2 : ");
		String name2=sc.nextLine();
		System.out.println("Enter Department : ");
		String department2=sc.nextLine();
		System.out.println("Enter Roll no : ");
		int rollNo2=sc.nextInt();
		
//		School s1=new School("KVS","MCA",101);
//		School s2=new School("SRM","CSC",143);
		
		
		School s1=new School(name,department,rollNo);
		School s2=new School(name2,department2,rollNo2);
		System.out.println(s1.getDisplayDetails());
		System.out.println(s2.getDisplayDetails());
		
	}
}
