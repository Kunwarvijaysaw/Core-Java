package Aug08;

class BillDesk {

	public static void main(String[] args) {
		double amount=40000;
		System.out.println("Total Bill Amount"+amount);
				
		if(amount>=30000)
		{
		System.out.println("you are Eligibile for 20% Discount");
		double discount= amount*0.2;
		System.out.println("Discount Amount: "+discount);
		System.out.print("Final Amount : ");

		System.out.println(amount-(amount*0.2));
		}
		else
		{			 
		System.out.println("Final Amount : "+amount);
		}


	}

}
