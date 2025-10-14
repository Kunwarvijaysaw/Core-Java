package Aug12;
import java.util.Scanner;

public class ElectricityAmountCalculator {
	public static void main(String[]args){
        //int units = 250;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Units : ");
        int units = sc.nextInt();
        double TotalAmount=0;
        if(units<=100)
        {
            double baseBill = units*5;
             TotalAmount =baseBill;
        }
        else if(units>100 && units<=200)
        {
            double baseBill = (100 * 5) + ((units - 100) * 7);
             TotalAmount =baseBill; 
        }
        else if(units>200 )
        {
            double baseBill = (100 * 5) + (100 * 7) + ((units - 200) * 10);
             TotalAmount =baseBill;
            }
            if(TotalAmount>2000){
            	double Surcharge = TotalAmount*0.05;
               System.out.println("Base Bill : "+TotalAmount);
                System.out.println("Surcharge : "+ Surcharge);
                System.out.println("Total Bill : "+ (TotalAmount+Surcharge));
            }
            else{
                System.out.println("Base Bill : "+TotalAmount);
                System.out.println("Total Bill : "+TotalAmount);
            }
        }
	}



