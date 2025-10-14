package Oct07HasARelation;

class Car {
	private String make;
	private String model;
	private Engine engine;
	
	public Car(String make, String model, Engine engine) {
		
		this.make = make;
		this.model = model;
		this.engine = engine;
	}
	public String displayCarDetails() {
		return "Car maker : "+this.make+
				"\nCar Model : "+this.model+
				"\nCar Engine : "+this.engine.displayEngineDetails();
	}

}
