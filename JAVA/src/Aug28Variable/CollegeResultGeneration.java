package Aug28Variable;

import java.util.Scanner;

class CollegeResultGeneration {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		Result r1 = new Result();
		System.out.println("Enter Subject 1 Marks : ");
		int sub1 = sc.nextInt();
		System.out.println("Subject 2 Marks : ");
		int sub2 = sc.nextInt();
		System.out.println("Subject 3 Marks : ");
		int sub3 = sc.nextInt();
		r1.calculateResult(sub1, sub2, sub3);
		r1.displayResult();
		
		

	}

}
