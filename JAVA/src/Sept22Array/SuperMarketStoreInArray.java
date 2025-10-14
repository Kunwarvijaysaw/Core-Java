package Sept22Array;
/*A supermarket stores daily sales data as a list of item codes sold during the day.
Each item is represented by an integer (item code).
Write a program to:

Accept the list of item codes (n items).

Accept an item code to search.

Count how many times that item code was sold and display the count.
Sample Input
6
101 102 103 101 104 101
101
Sample Output
Item code 101 was sold 3 times.*/
import java.util.Scanner;

public class SuperMarketStoreInArray {
	 public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter how many number store in arry : ");
 		int n = sc.nextInt();
 		 System.out.println("Enter arry element : ");
 	        
 		int arr[] = new int[n];// Array length n
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();  
        }
        System.out.println("Enter Sale element : ");
        int e=sc.nextInt();
         int c=0;
        for(int i=0;i<arr.length;i++)
        {
           
           if(e==arr[i])
           {
                c++;
           }
       
            
        }
    if(c == 0){
         System.out.println("Item code "+e+" was not sold today.");
    }else
          System.out.println("Item code "+e+" was sold "+c+" times.");
        
    }
}