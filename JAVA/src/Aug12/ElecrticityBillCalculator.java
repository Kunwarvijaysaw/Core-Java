package Aug12;

class ElecrticityBillCalculator {
	private static final int TotalAmount = 0;

	public static void main(String[]args){
        int units = 500;

        if(units<=100)
        {
            double baseBill = units*5;
            double Surcharge = baseBill*0.05;
             double TotalAmount =baseBill+Surcharge;
            System.out.println("Base Bill : "+baseBill);
            System.out.println("Surcharge (5%) : "+Surcharge);
             System.out.println("Total Bill : "+TotalAmount);
        }
        else if(units>100 && units<=200)
        {
            double baseBill = (100 * 5) + ((units - 100) * 7);
            double Surcharge = baseBill*0.05;
             double TotalAmount =baseBill+Surcharge;
            System.out.println("Base Bill : "+baseBill);
            System.out.println("Surcharge (5%) : "+Surcharge);
             System.out.println("Total Bill : "+TotalAmount);
        }
        else if(units>200 )
        {
            double baseBill = (100 * 5) + (100 * 7) + ((units - 200) * 10);
            double Surcharge = baseBill*0.05;
            double TotalAmount =baseBill+Surcharge;
           
            System.out.println("Base Bill : "+baseBill);
            System.out.println("Surcharge (5%) : "+Surcharge);
             System.out.println("Total Bill : "+ TotalAmount);
            }
            if(TotalAmount>2000){
                double ExtraCharge = TotalAmount*0.05;
                System.out.println("Total Bill : "+ (TotalAmount+ExtraCharge));

            }
        }

         

       
        

	

}
