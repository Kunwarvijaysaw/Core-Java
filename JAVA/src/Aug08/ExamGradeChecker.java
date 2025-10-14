package Aug08;
import java.util.Scanner;

class ExamGradeChecker {
	public static void main (String[]args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Marks : ");
		int m = sc.nextInt();
		String result = (m>=50)?"Eligible for Certificate" : "Better Luck Next Time";
		System.out.println(result);
		
		
	}

}
