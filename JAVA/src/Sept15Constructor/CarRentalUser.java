package Sept15Constructor;
/*2.Car_Rental_Service
Create a class CarRental with a constructor to initialize carName, dailyRate, and number of days.
Add a method getTotalCost() and another method showRentalDetails() to display rental summary.

Class Name:
CarRental

Instance Variables:
- carName (String)
- dailyRate (double)
- days (int)

Constructor:
- CarRental(String carName, double dailyRate, int days)

Methods:
- getTotalCost() → returns dailyRate × days
- showRentalDetails() → prints rental details

Main Class:
- CarMain

Input Format:
Car Name (String)
Daily Rate (double)
Number of Days (int)

Output Format:
Car: <carName>, Days: <days>, Total Cost: <totalCost>

Note:
Use Scanner with next() for String input.
Sample Input
ToyotaCamry
45
3
Sample Output
Car: ToyotaCamry, Days: 3, Total Cost: 135.0*/
import java.util.Scanner;

class CarRentalUser {

	public static void main (String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Car Name : ");
        String carName=sc.nextLine();
        System.out.println("Enter Price: ");
        double dailyRate=sc.nextDouble();
        System.out.println("Enter Days : ");
        int days=sc.nextInt();
        CarRental c1=new CarRental(carName,dailyRate,days);
        c1.getTotalCost();
        System.out.println(c1.showRentalDetails());
    }
}

class CarRental{
   String carName;
    double  dailyRate;
    int days;
    int amount;
    public CarRental(String carName,double dailyRate,int days){
        this.carName=carName;
        this.dailyRate=dailyRate;
        this.days=days;

    }
    public double getTotalCost(){
        
        return dailyRate*days;
    }
    public String showRentalDetails() {
        return "Car: "+carName+", Days: "+days+", Total Cost: "+getTotalCost();
    }
}