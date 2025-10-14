package InstanceVariable;

class Car {
	String CarOfBrand;
	String CarOfColor;
	double CarOfMailege;
	 static int CarOfWheels=4;
	 
	public static void carTypes() {
		Car c1=new Car();
//		c1.CarOfBrand;
//		c1.CarOfColor;
//	    c1.CarOfMailege;
		System.out.println("Car of Brand : "+c1.CarOfBrand);
		System.out.println("car of color : "+c1.CarOfColor);
		System.out.println("Car of Mailege : "+c1.CarOfMailege);
		System.out.println("Car Of Wheels : "+c1.CarOfWheels);
		
		
		
	}

	public static void main(String[] args) {
		carTypes();

	}

}
