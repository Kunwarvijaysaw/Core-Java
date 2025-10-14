package Sept24Array;
/*2. Food Delivery App - Order Queue Management
--------------------------------------------------
Scenario:
In a food delivery app, there’s a fixed-size queue of orders that the kitchen
is currently processing. You need to implement logic to remove the oldest order
and add a new one to keep the array updated.

Problem Statement:
Write a method that takes an array of order IDs (integers), removes the first one,
and adds a new order ID at the end. Assume fixed size of the array.

public int[] updateOrderQueue(int[] currentOrders, int newOrderId) {
    // implement logic here
}


Example Input:
currentOrders = [101, 102, 103, 104], newOrderId = 105
Output:
[102, 103, 104, 105]
Sample Input
Example Input:
currentOrders = [101, 102, 103, 104], newOrderId = 105
Sample Output
Output:
[102, 103, 104, 105]*/
import java.util.*;
public class FoodDeliveryApp {

	
	
	
    public static void main(String []args){
        Scanner sc=new Scanner (System.in);
        
        int arr[]=new int[5];
        System.out.println("Enter Array element :");
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        
        for(int i=0;i<4;i++){
            arr[i]=arr[i+1];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter new element :");
        arr[arr.length-1]=sc.nextInt();
        System.out.println(Arrays.toString(arr));
      

       }
   }