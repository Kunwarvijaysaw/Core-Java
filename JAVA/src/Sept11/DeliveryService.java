package Sept11;

import java.util.Scanner;

public class DeliveryService {

	public static void main(String[] args) {
		Order r1 = new Order();
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter orderId") ;
       int orderId=sc.nextInt();
       sc.nextLine();
        System.out.println("Enter foodItem") ;
        String foodName=sc.nextLine();
//        sc.nextLine();
        System.out.println("Enter price") ;
        double price=sc.nextDouble();
        System.out.println("Enter delivered Status") ;
        boolean delivered=sc.nextBoolean();
        r1.setOrderId(orderId);
        r1.setFoodName(foodName);
        r1.setPrice(price);
        r1.setDelivered(delivered);
        r1.processOrder();
        System.out.println(r1.displayOrder());;
        System.out.println("Order marked as Delivered.");

	}

}
