package Aug28Variable;

import java.util.Scanner;

public class OnlineCourseFeedback {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		OnlineCourse c1 = new OnlineCourse();
		System.out.println("Enter Student Name : ");
		String name = sc.nextLine();
		System.out.println("Enter Course Name : ");
		String courseName = sc.nextLine();
		System.out.println("Enter Rating (out of 5) : ");
		int rating = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Feedback : ");
		String feedback = sc.nextLine();
		c1.collectFeedback(name, courseName, rating, feedback);
		c1.displayFeedback();
		

	}

	
}
