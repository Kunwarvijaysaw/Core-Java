package Sept08;

class ShoppingCartDiscountCalculator {

	private double itemPrice ;
	private int quantity ;
	private double discountPercentage ;
	
	public double getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity =  quantity;
	}
	public double getDiscountPercentage() {
		return discountPercentage;
	}
	public void setDiscountPercentage(double discountPercentage) {
		this.discountPercentage = discountPercentage;
	}
	
	public double calculateTotalPrice() {
		double total = itemPrice * quantity;
		return total;
	}
	
	public double calculateDiscountedPrice() {
		double discountedPrice = (calculateTotalPrice())-
		(calculateTotalPrice() * (discountPercentage / 100.0));
		return discountedPrice;
		
	}
	
	
	
}
