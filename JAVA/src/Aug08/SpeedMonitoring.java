package Aug08;

import java.util.Scanner;

	public class SpeedMonitoring {
		public static void main (String[]args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Speed : ");
		int speed = sc.nextInt();
		String result = (speed>=100)?"Over Speeding" : "Safe Speed";
		System.out.println(result);
		
		
	}


}
