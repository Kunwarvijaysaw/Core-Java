package InterviewQuestion;

import java.util.Scanner;

class ValidPassword {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int up=0,lp=0,dp=0,sp=0;
		System.out.println("Enter password : ");
		String pass =sc.nextLine();
		if(pass.length()>=8) {
			for(int i=0;i<pass.length();i++) {
				if(pass.charAt(i)>='a' && pass.charAt(i)<='z') {
					lp++;
				}else if(pass.charAt(i)>='A' && pass.charAt(i)<='Z') {
					up++;
				}else if(pass.charAt(i)>='0' && pass.charAt(i)<='9') {
					dp++;
				}else {
					sp++;
				}
					
			}
			if(lp>0 && up>0 && dp>0 && sp>0) {
				System.out.println("Valid Password Created successfully");
			}else {
				System.out.println("Invalid Password");
			}
		
		}else {
			System.out.println("Password Must be 8 Digit");
		}
		

	}

}
