package Sept11;

class ShoppingCart {
	 
	public void addToCart(Product p, int qty) {
		if(qty<=p.getQuantity()) {
			p.setQuantity(p.getQuantity()-qty);
			System.out.println(qty+" "+p.getName()+" added to Cart");
			//System.out.println("Remaining :"+p.getName()+" in stock : "+p.getQuantity());
		}
		else {
			System.out.println("Insufficient stock or Invalid price");
		}
	}

}
