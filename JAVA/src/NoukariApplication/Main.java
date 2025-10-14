package NoukariApplication;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter UserID : ");
		String userId=sc.nextLine();
		System.out.println("Enter Candidate Name : ");
		String candidateName=sc.nextLine();
		System.out.println("Enter Mobile Number: ");
		long mobileNo=sc.nextLong();
		sc.nextLine();
		System.out.println("Enter Email Id : ");
		String emailId=sc.nextLine();
		System.out.println("Enter DOB: ");
		String dob=sc.nextLine();
		System.out.println("Enter Qualification : ");
		String qualification=sc.nextLine();
		System.out.println("Enter Year of Experience : ");
		int yoe=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Skill Set : ");
		String skillSet=sc.nextLine();
		System.out.println("Enter Street Name : ");
		String streetName=sc.nextLine();
		System.out.println("Enter Pin Code : ");
		int pinCode=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Dist : ");
		String dist=sc.nextLine();
		System.out.println("Enter State : ");
		String state=sc.nextLine();
		System.out.println("Enter Country : ");
		String country=sc.nextLine();
		Address a1=new Address(streetName, pinCode, dist, state, country);
		Profile p1=new Profile(candidateName, mobileNo, emailId, dob, qualification, yoe, skillSet, a1);
		Noukri n1=new Noukri(userId, p1);
		System.out.println(n1.displayDetails());
	}
	

}
