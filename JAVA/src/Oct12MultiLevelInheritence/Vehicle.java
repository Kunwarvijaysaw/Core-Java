package Oct12MultiLevelInheritence;

public class Vehicle {
	String brandName;
	String color;
	String model;
	int wheels;

	public Vehicle(String brandName, String color, String model, int wheels) {
		super();
		this.brandName = brandName;
		this.color = color;
		this.model = model;
		this.wheels = wheels;
	}

	public void accelerate() {
		System.out.println("Vehicle start to move");
	}

	public void applyBreak() {
		System.out.println("Vehicle stop!");
	}

	public void displayDetails() {
		System.out.println("Brand Name : " + brandName);
		System.out.println("Color : " + color);
		System.out.println("Model : " + model);
		System.out.println("Wheels : " + wheels + " wheels");
	}

}
