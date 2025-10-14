package Sept25array;
/*ArraySortDescending
Q3. Write a program to accept 10 numbers in an array and sort it in descending order.
Sample Input
12 5 7 2 19 11 25 4 9 15
Sample Output
Numbers in descending order:
25 19 15 12 11 9 7 5 4 2*/
import java.util.Scanner;
class ArraySortDescending{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=10;
        int arr[]=new int[10];
        System.out.println("Enter "+n+" Array Element :");
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }
        
        for(int i=0;i<10;i++){
           for(int j=0;j<10-i-1;j++){
            if(arr[j]<arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
           }
        }
         System.out.println("Numbers in descending order:");
        for(int i=0;i<10;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}