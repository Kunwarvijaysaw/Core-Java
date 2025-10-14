package Aug28Variable;

import java.util.Scanner;

class LibraryMembershipRegistration {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		Student s1 = new Student();
		System.out.println("Enter Full Name : ");
		String fullName=sc.nextLine();
		System.out.println("Enter Roll Number : ");
		int rollNumber=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Department Name : ");
		String department=sc.nextLine();
		System.out.println("Enter Email Id : ");
		String emailId=sc.nextLine();
		System.out.println("Enter Mobile Number : ");
		long mobileNo=sc.nextLong();
		s1.setInput(fullName, rollNumber, department, emailId, mobileNo);
		s1.display();
	}

}
