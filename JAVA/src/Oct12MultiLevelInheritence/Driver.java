package Oct12MultiLevelInheritence;

class Driver {

	public static void main(String[] args) {
		Car car = new Car("Tata", "Black", "SPL", 4);
		ElectricCar electricCar = new ElectricCar("ODI", "RED", "Ver-1", 4, 50000);
		car.accelerate();
		car.applyBreak();
		car.displayDetails();
		System.out.println("========================");
		electricCar.accelerate();
		electricCar.applyBreak();
		electricCar.charge();
		electricCar.displayElectricCarDetails();

	}

}
