package FactoryDesignPattern;

public class BikeFactory extends VehicleFactory {

	@Override
	Vehicle createVehicle() {
		
		return  (Vehicle) new Bike();
	}

	
		
	}


