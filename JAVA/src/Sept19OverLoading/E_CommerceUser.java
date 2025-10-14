package Sept19OverLoading;

public class E_CommerceUser {

	public static void main(String[] args) {
	E_Commerce e1= new 	E_Commerce("Laptop",50000,1,"123 block","Card");
	E_Commerce e2= new 	E_Commerce(e1,"abc block","Cash");
	System.out.println(e1.displayDetails());
	System.out.println("\n");
	System.out.println(e2.displayDetails());
	}

}
