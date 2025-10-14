package Sept18OverLoading;

import java.util.Scanner;

class CourseUser {

	public static void main(String[] args) {
//		Scanner sc=new Scanner (System.in);
//		System.out.println("Enter Course Id : ");
//		String courseId=sc.next();
//		
//		System.out.println("Enter Course Name : ");
//		String courseName=sc.nextLine();
//		System.out.println("Enter Course Duration : ");
//		int duration=sc.nextInt();
		
		Course c1 =new Course();
		Course c2 =new Course("101","Java");
		Course c3 =new Course("102","Python",3);
		System.out.println("==========================================");
		System.out.println(c1.displayDetails());
		
		System.out.println("==========================================");
		System.out.println(c2.displayDetails());
		
		System.out.println("==========================================");
		System.out.println(c3.displayDetails());
		

	}

}
