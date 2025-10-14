package Sept18OverLoading;

public class Vehicle {
	String registrationNumber;
	String ownerName;
	String model;
	int year;
	
	public Vehicle(String registrationNumber) {
		
		this.registrationNumber = registrationNumber;
	}

	public Vehicle(String registrationNumber, String ownerName) {
		
		this.registrationNumber = registrationNumber;
		this.ownerName = ownerName;
	}

	public Vehicle(String registrationNumber, String ownerName, String model, int year) {
		
		this.registrationNumber = registrationNumber;
		this.ownerName = ownerName;
		this.model = model;
		this.year = year;
	}
	
	
	public String displayDetails() {
		return "Registration Number : "+registrationNumber+" , Owner Name : "+ownerName+
				" , Model : "+model+" , Year : "+year;
	}
	

}
