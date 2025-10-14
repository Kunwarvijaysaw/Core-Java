package Sept08;

import java.util.Scanner;

public class FuelEfficiencyCalculator {
	
	private double fuelConsumed;
	private double distanceTravelled;
	
	

	public void setFuelConsumed(double fuelConsumed) {
		this.fuelConsumed = fuelConsumed;
	}

	public void setDistanceTravelled(double distanceTravelled) {
		this.distanceTravelled = distanceTravelled;
	}
	
	public double getFuelConsumed() {
		return fuelConsumed;
	}

	public double getDistanceTravelled() {
		return distanceTravelled;
	}


	

	public double calculateMileage() {
		double mileage = distanceTravelled / fuelConsumed;
		return mileage;
		
	}
	
	public double calculateFuelEfficiency() {
		double  fuelEfficiency = (fuelConsumed / distanceTravelled) * 100;
		return fuelEfficiency;
	}

	
	
}
