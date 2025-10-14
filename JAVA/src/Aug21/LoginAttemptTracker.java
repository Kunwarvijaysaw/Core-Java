package Aug21;

import java.util.Scanner;

/*5. Login Attempt Tracker
A website limits login attempts to 3 tries.
If you implement the login() function with a local counter, will the restriction work? Why or why not?
How can a static variable help implement this feature correctly?*/

class LoginAttemptTracker {
	
	static int count=0;
	public static void  loginAttempts(String pass) {
			if(!pass.equals("abc123")) {
				count++;
				System.out.println("Try again....");
				
			}else {
				System.out.println("Login Sucessfull");
			}
			
			if(count>=3) {
				System.out.println("Your Card Block");
			}
		
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Pass");
		String pass=sc.nextLine();
		for(int i=1;i<=3;i++) {
		loginAttempts(pass);
		}
//		loginAttempts("ihvyf");
//		loginAttempts("abc1213");

	}

}
