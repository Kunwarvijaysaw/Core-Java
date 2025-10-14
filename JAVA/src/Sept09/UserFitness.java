package Sept09;

import java.util.Scanner;

public class UserFitness {
	public static void main(String[] args) {
		FitnessTracker f1= new FitnessTracker();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Daily Steps : ");
		f1.setDailySteps(sc.nextInt());
		System.out.println("Enter Calories Burned : ");
		f1.setCaloriesBurned(sc.nextDouble());
		
		System.out.println("Enter Active Minutes : ");
		f1.setActiveMinutes(sc.nextInt());
		System.out.println("Daily Steps : "+f1.getDailySteps());
		System.out.println("Calories Burned : "+f1.getCaloriesBurned());
		System.out.println("Active Minute : "+f1.getActiveMinutes());
		
		

	}
}
