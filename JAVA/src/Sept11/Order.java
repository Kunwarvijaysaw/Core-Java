package Sept11;

import java.util.Scanner;

public class Order {
	private int orderId;
    private String foodName;
    private double price;
    boolean delivered;

   public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
     public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
   public void setPrice(double price){
       this.price=price;
   }
   public void setDelivered(boolean delivered){
       this.delivered =delivered;
   }
   public int getOrderId(){
       return orderId;
   }
    public String getFoodName(){
       return foodName;
   }
    public double getPrice(){
       return price;
   }
    public boolean getDelivered(){
       return delivered;
   }
    
   public String displayOrder(){
       return "Order Id: "+orderId+
       " Food Item: "+foodName+
       " Price: "+(50+price) +
       " Delivered Status: "+delivered;
   }
   public boolean markAsDelivered() {
	   delivered = true;
	   return getDelivered();
   }
   public void processOrder() {
	   System.out.println("Processing Order "+orderId+" for "+foodName);
	   if(price>0) {
		   System.out.println("Delivery charge of ₹50 applied.");  
	   }
	
   }

 class DeliveryService {

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
}
