package Aug08;

import java.util.Scanner;

class StudentResult {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Average Marks : ");
		int avgm=sc.nextInt();
		
		String result=(avgm>=75)?"Distinction":(avgm>=40)?"Pass":"Fail";
		System.out.println(result);
		

	}

}
