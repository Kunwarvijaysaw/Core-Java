/* Question 1: Food Delivery App (with explicit validations)

You are designing a system for a food delivery app where users can browse and
update food items. Each food item has a name, price, and category (e.g., "Starter",
"Main Course", "Dessert").

Task:

Create a class FoodItem with private fields:
String itemName — stores the name of the food item.
double price — stores the price of the item.
String category — stores the category of the item.

Implement setter methods using the this keyword with validations:
itemName cannot be null or empty. If invalid, print an error message.
category cannot be null or empty. If invalid, print an error message.
price cannot be negative. If invalid, print an error message.
Implement getter methods to retrieve the values of these fields.
Write a main class to:
Create 3 FoodItem objects.
Use setter methods to set their details.
Display the details using getter methods.
Update the price of one food item and print the updated details*/
package Sept09;

class Food {
	
	private String itemName;
	private double price;
	private String category;
	
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	public String getItemName() {
		return itemName;
	}
	public double getPrice() {
		return price;
	}
	public String getCategory() {
		return category;
	}
	
}
