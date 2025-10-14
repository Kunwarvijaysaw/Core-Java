package Sept25array;
/*SumOddEvenPositions
Q1. Accept 10 numbers into an array and then calculate the sum of numbers present in odd positions and even positions respectively.
Sample Input
1 2 3 4 5 6 7 8 9 10
Sample Output
Sum of numbers at odd positions = 25
Sum of numbers at even positions = 30*/
import java.util.Scanner;
class SumOddEvenPositions{
   public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       
       int arr[]=new int[10];
       System.out.println("Enter 10 Array Element");
       for(int i=0;i<10;i++){
           arr[i]=sc.nextInt();
       }
       int oddSum=0;
       int evenSum=0;
       for(int i=0;i<10;i++){
           if((i+1)%2==0){
               evenSum=evenSum+arr[i];
           }
           else{

               oddSum=oddSum+arr[i];
           }
          }
       
        System.out.println("Sum of numbers at odd positions = "+oddSum);
        System.out.println("Sum of numbers at even positions = "+evenSum);
       
       
   }
}