package Aug11;

import java.util.Scanner;

class ShippingCostCalculator{
    public static void main(String[]args){
       // double weight = 8;
        Scanner sc= new Scanner(System.in);
        System.out.println(" Enter Weight : ");
        double weight= sc.nextInt();
        double baseCost= 1*50+(weight-1)*20;
        System.out.println("Base Cost : "+ baseCost);
        if(weight<5 && baseCost>200)
        {
            System.out.println("Discount Applied: 10%");
            System.out.println("final Cost :" +( baseCost- baseCost*0.10) );
            
        }
        else if(baseCost>100)
        {
             System.out.println("Discount Applied: 5%");  
              System.out.println("final Cost :" + (baseCost- baseCost*0.05) ); 
        }
    }
        

}
