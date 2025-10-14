package Sept11;

class Product {
	private String name;
	private double price;
	private int quantity;
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setPrice(double price) {
		this.price=price;
	}
	
	public void setQuantity(int quantity) {
		this.quantity=quantity;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public String getDisplayProduct() {
		return "Product: "+name+", "+"Price: "+price+", "+"Stock left: "+quantity;
	}
	
}

