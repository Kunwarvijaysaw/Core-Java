package Sept24Array;
/*4. Stock Market App - Detect Sudden Drop
----------------------------------------
Scenario:
In a stock market monitoring app, you want to alert users when a stock price
drops more than 5% compared to the previous day.

Problem Statement:
Write a method that takes an array of stock prices (double) and prints all the
days where the drop is more than 5% compared to the previous day.
Hint:
double previous = prices[i - 1];
double current = prices[i];
dropPercent = ((previous - current) / previous) * 100;

public void detectPriceDrops(double[] prices) {
    // implement logic  
}

Sample Input
Example Input:
[100.0, 98.0, 92.0, 95.0, 89.0]
Sample Output
Output:
Day 2: drop > 5%, Day 4: drop > 5%*/
import java.util.Scanner;
class StockMarketApp{
   public  void detectPriceDrops(double[] prices) {
    for(int i=1;i<prices.length;i++){
        double previous = prices[i - 1];
        double current = prices[i];
        double dropPercent = ((previous - current) / previous) * 100;
        if(dropPercent>5){
            System.out.println("Day "+i+" :drop > 5%");
        }
    }
}
   
   
   
    public static void main(String []args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        double arr[]=new double[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextDouble();
        }
        StockMarketApp s1=new StockMarketApp();
        s1.detectPriceDrops(arr);
  
        
    }
}
