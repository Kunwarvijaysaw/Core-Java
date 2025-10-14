package Sept18OverLoading;

public class Order {
	String orderId;
	String customerName;
	int deliveryTimeInMinutes;
	
	public Order(String orderId, String customerName, int deliveryTimeInMinutes) {
		this.orderId = orderId;
		this.customerName = customerName;
		this.deliveryTimeInMinutes = deliveryTimeInMinutes;
	}
	
}
