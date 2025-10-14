package Sept10;

import java.util.Scanner;

public class AdmissionChecker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student s1= new Student();
		System.out.println("Enter First number : ");
		int marks=sc.nextInt();
        boolean extracurricular=sc.nextBoolean();
		
		s1.isEligible(marks,extracurricular);
		
		
	}

}
class Student{
	int marks;
    boolean extracurricular=false;
	
	
	public boolean isEligible( int marks,boolean extracurricular) {
		if(marks>100){
			System.out.println("Invalid marks");
		 	return false;
		}
		 else if(marks>=85 && extracurricular==true) {
            System.out.println("Eligible for admission");
			return true;
		}
		// else if(marks>100&& extracurricular==true){
		// 	            System.out.println("Invalid marks");
		// 	return false;
		// }
		else {
            System.out.println("Not eligible for admission");
			return false;
		}
		
	}
}


