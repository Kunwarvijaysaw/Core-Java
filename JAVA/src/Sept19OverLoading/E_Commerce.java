package Sept19OverLoading;

class E_Commerce {
	String itemName;
	double itemPrice;
	int quantity;
	String deliveryAddress;
	String paymentMethod;
	
	public E_Commerce(String itemName, double itemPrice, int quantity, String deliveryAddress, String paymentMethod) {
	
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.quantity = quantity;
		this.deliveryAddress = deliveryAddress;
		this.paymentMethod = paymentMethod;
	}
	
	public E_Commerce(E_Commerce e, String deliveryAddress,String paymentMethod) {
		this.itemName = e.itemName;
		this.itemPrice = e.itemPrice;
		this.quantity = e.quantity;
		this.deliveryAddress = deliveryAddress;
		this.paymentMethod = paymentMethod;
		
		
	}
	
	public String displayDetails(){
		return "Iteam Name: "+itemName+"\nIteam Price: "+itemPrice+
		       "\nquantity: "+quantity+"\nDelivery Address: "+deliveryAddress+"\nPayment Mathod : "+paymentMethod;
		}
}
