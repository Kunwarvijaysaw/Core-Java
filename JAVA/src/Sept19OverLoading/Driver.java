package Sept19OverLoading;

public class Driver {

	public static void main(String[] args) {
		Vehicle v1=new Vehicle("Vijay Reddy","Honda Civic","Blue "," TS09K1234 ");
		Vehicle v2= new Vehicle(v1,"sk");
		System.out.println(v1.displayDetails());
		System.out.println("\n");
		System.out.println(v2.displayDetails());
		
		

	}

}
