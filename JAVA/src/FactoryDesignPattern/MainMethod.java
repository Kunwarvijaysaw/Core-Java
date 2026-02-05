package FactoryDesignPattern;

public class MainMethod {

	public static void main(String[] args) {
		VehicleFactory factory=new CarFactory();
		Vehicle v= factory.createVehicle();
		v.drive();

	}

}
