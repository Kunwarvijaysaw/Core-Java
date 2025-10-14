package Oct12MultiLevelInheritence;

public class ElectricCar extends Vehicle {
	double batteryCapacity;

	public ElectricCar(String brandName, String color, String model, int wheel, double batteryCapacity) {
		super(brandName, color, model, wheel);
		this.batteryCapacity = batteryCapacity;

	}

	public void charge() {
		System.out.println("car is kept on charge");
	}

	public void displayElectricCarDetails() {
		displayDetails();
		System.out.println("Battery Capacity : " + batteryCapacity + " HP");

	}

}
