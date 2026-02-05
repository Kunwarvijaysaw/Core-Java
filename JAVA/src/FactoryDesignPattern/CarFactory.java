package FactoryDesignPattern;

class CarFactory extends VehicleFactory {
    @Override
	Vehicle createVehicle() {
        return (Vehicle) new Car();
    }
}

