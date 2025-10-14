package Sept01;

import java.util.Scanner;

class Student_Report_Card {
	String name;
	int marks;
	public void setDetails(String name,int marks) {
		this.name=name;
		this.marks=marks;
	}
	
	public void displayMarks() {
		System.out.println("Student Details");
		System.out.println("Student Name : "+name);
		System.out.println("Student Marks : "+marks);
	}

	public static void main(String[] args) {
		Student_Report_Card sm1 =new Student_Report_Card();
		Student_Report_Card sm2 =new Student_Report_Card();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Name : ");
		String name =sc.nextLine();
		System.out.println("Enter Student Marks : ");
		int marks =sc.nextInt();
		sm1.setDetails(name, marks);
		sc.nextLine();
		System.out.println("Enter Student2 Name : ");
		String name2 =sc.nextLine();
		System.out.println("Enter Student2 Marks : ");
		int marks2 =sc.nextInt();
		sm2.setDetails(name2, marks2);
		sm1.displayMarks();
		sm2.displayMarks();
		

	}

}
