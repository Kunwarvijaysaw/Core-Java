package Sept18OverLoading;

public class VehicleUser {

	public static void main(String[] args) {
		Vehicle v1=new Vehicle("KA01AB1234");
		Vehicle v2=new Vehicle("MH12XY7890","John");
		Vehicle v3=new Vehicle("DL04GH4567","Jane","Honda City",2020);
		
		System.out.println(v1.displayDetails());
		System.out.println("\n");
		System.out.println(v2.displayDetails());
		
		System.out.println("\n");
		System.out.println(v3.displayDetails());
		
	}

}
