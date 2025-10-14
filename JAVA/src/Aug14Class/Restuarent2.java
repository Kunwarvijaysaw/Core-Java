package Aug14Class;

class Restuarent2 {
	public static void placeOrder(String itemName,double quantity,double price,
            long mobileNo){
		System.out.println("Dish name: "+itemName);
		System.out.println("Quantity: "+quantity);
		double billExcludingGST = quantity*price;
		System.out.println("Price excluding GST: Rs. "+billExcludingGST);
		System.out.println("Food prepared. Enjoy your meal");
		generateBill(mobileNo,billExcludingGST);//calling method by passing variables
	}
		public static void generateBill(long mobileNo,double billExcludingGST){
			double gst = 18.5;
			double amount =  ((gst/100.0)*billExcludingGST) + billExcludingGST;
			sendMessage(mobileNo,amount);
		}
			public static void sendMessage(long mobileNo,double amount){
				System.out.println("Hello "+mobileNo+" Hope you liked the food");
				System.out.println("Your bill has been prepared. Kindly pay Rs. "+amount);
			}
			public static void main(String []args){
				placeOrder("Biryani",2,1000,9438123456L);
			}
	}
