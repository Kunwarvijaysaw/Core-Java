package Sept16Constroctor;
/*Online_Course_Purchase_System
Q. Online Course Purchase with Tiered Discounts and Reward Points
An online learning platform gives discounts and reward points on courses depending on the total course fee.

Total Fee Range	Discount	Reward Points
Up to ₹5,000	5%	10 points
₹5,001 - ₹15,000	10%	30 points
₹15,001 - ₹30,000	18%	60 points
More than ₹30,000	25%	100 points

Tasks:
Create a class CoursePurchase with:

Data Members:
student_name: Name of the student
total_fee: Total fee of selected courses
discount: Discount value
reward_points: Earned reward points
net_payable: Fee to be paid after discount

Member Methods:
Parameterized constructor to initialize the student name and fee.

Method to calculate:
Discount
Reward points
Net payable amount
Method to display all information.

Write the main method to test the class with user input.
Sample Input
Rahul
4000
Sample Output
---- Online Course Bill ----
Student Name: Rahul
Total Fee: Rs:4000.0
Discount: Rs:200.0
Reward Points Earned: 10
Net Amount Payable: Rs:3800.0*/
import java.util.Scanner;

public class CoursePurchaseUser {

	public static void main (String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Student Name :");
        String student_name=sc.next();
        System.out.println("Enter Amount :");
        double total_fee=sc.nextDouble();
        CoursePurchase c1=new CoursePurchase(student_name,total_fee);
        c1.setDiscount();
        c1.setRewardPoints();
        c1.getPayableAmount();
        System.out.println(c1.getDisplay());
    }
}
class CoursePurchase{

String student_name;
double total_fee;
double discount;
int rewardPoints;
double net_payable;

CoursePurchase(String student_name,double total_fee){
    this.student_name=student_name;
    this.total_fee=total_fee;
}

public void setDiscount(){
    if(total_fee>0 && total_fee<=5000){
        discount= total_fee*5/100;
    }else  if(total_fee>5000 && total_fee<=15000){
        discount= total_fee*10/100;
    }else  if(total_fee>15000 && total_fee<=30000){
        discount= total_fee*18/100;
    }else{
        discount= total_fee*25/100;
    }
}

public void setRewardPoints(){
    if(total_fee>0 && total_fee<=5000){
        rewardPoints= 10;
    }else  if(total_fee>5000 && total_fee<=15000){
        rewardPoints= 30;
    }else  if(total_fee>15000 && total_fee<=30000){
        rewardPoints= 60;
    }else{
       rewardPoints= 100;
    }
}
public double getPayableAmount(){
    return (total_fee-discount);
}

public String getDisplay(){
    return "---- Online Course Bill ----"+
    "\nStudent Name: "+student_name+
    "\nTotal Fee: Rs."+total_fee+
    "\nDiscount: Rs."+discount+
    "\nReward Points Earned: "+rewardPoints+
    "\nNet Amount Payable: Rs."+getPayableAmount();
}
}

