package Sept08;

import java.util.Scanner;

public class SwiftCar {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		FuelEfficiencyCalculator f1=new FuelEfficiencyCalculator();
		System.out.println("Enter Fuel Consumed : ");
		double fuelConsumed=sc.nextDouble();
		
		System.out.println("Enter distanceTravelled : ");
		double distanceTravelled=sc.nextDouble();
		f1.setFuelConsumed(fuelConsumed);
		f1.setDistanceTravelled(distanceTravelled);
		
		System.out.println("mileage : "+f1.calculateMileage()+" km/l");
		System.out.println("fuelEfficiency : "+f1.calculateFuelEfficiency()+" L/100km");
	}


}
