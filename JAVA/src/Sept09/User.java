package Sept09;

import java.util.Scanner;

public class User {
	
public static void main(String[] args) {
	Food f1= new Food();
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter Food Item : ");
	f1.setItemName(sc.nextLine());
	System.out.println("Enter Food Price : ");
	f1.setPrice(sc.nextDouble());
	sc.nextLine();
	System.out.println("Enter Food category : ");
	f1.setCategory(sc.nextLine());
	System.out.println("Food Name : "+f1.getItemName());
	System.out.println("Food Price : "+f1.getPrice());
	System.out.println("Food Category : "+f1.getCategory());
	
	

}
}