package InterviewQuestion;

import java.util.Scanner;

class Password {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Password (Password Must be UpperCase and Digit Ex.KVSR1234): ");
		String pass=sc.next();
		if(pass.length()>=8) {
			for(int i=0;i<pass.length();i++) {
				if(pass.charAt(i)>='A'&& pass.charAt(i)<='Z'&& pass.charAt(i)>='0'&& pass.charAt(i)<='9'){
					System.out.println("Password Valid");
				}
				else {
					System.out.println("Password Not Valid");
				}
		}
	}

	}
}
	
