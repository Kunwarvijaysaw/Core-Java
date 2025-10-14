package Sept19OverLoading;



 class Vehicle {
	String ownerName;
	String model;
	String color;
	String registrationNumber;
	public Vehicle(String ownerName, String model, String color, String registrationNumber) {
		
		this.ownerName = ownerName;
		this.model = model;
		this.color = color;
		this.registrationNumber = registrationNumber;
	}
	
	Vehicle(Vehicle v,String ownerName ){
		this.ownerName = ownerName;
		this.model = v.model;
		this.color = v.color;
		this.registrationNumber = v.registrationNumber;
	}
	
	public String displayDetails(){
		return "Owner Name: "+ownerName+"\nModel : "+model+
		       "\nColor: "+color+"\nRegistration Number :"+registrationNumber;
		}

}
