package Sept22Array;
/*Find the Largest and Smallest Element in an Array
Problem:
Write a program to input 10 integers in an array. Display the largest
and smallest elements from the array.

Sample Input:
45 67 23 89 12 34 56 78 90 11

Sample Output:
Largest: 90  
Smallest: 11
Sample Input
45 67 23 89 12 34 56 78 90 11
Sample Output
Largest: 90  
Smallest: 11*/
import java.util.Scanner;

public class LargestSmallestElementsInArray {
	public static void main(String []args){
        int arr[]= new int[10];//Array length 10
        System.out.println("Enter Arry Numbers : ");
        Scanner sc=new Scanner(System.in);
       
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[1];
        int min=arr[1];

        for(int i=0;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
            if(min>arr[i])
            {
                min=arr[i];
            }

        }
        System.out.println("Largest: "+max);
        System.out.println("Smallest: "+min);
    }
}