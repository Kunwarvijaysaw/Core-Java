package Sept23Array;
/*Scenario 1: Sum of Even Numbers in Odd Positions
You are given 10 numbers representing measurements taken at 10 different
checkpoints along a trail. Write a program to calculate the sum of all
even numbers that appear at odd positions (1st, 3rd, 5th, etc.) in the list.

Sample Input:
10 15 22 13 6 19 8 21 14 25
Sample Output:
Sum : 60            (10+22+6+8+14=60)
Sample Input
10 15 22 13 6 19 8 21 14 25
Sample Output
Sum : 60*/
import java.util.Scanner;
class SumofEvenNumbersInOddPositions{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        for(int i=0;i<10;i++){
             arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<10;i++){
            if((i+1)%2!=0 && arr[i]%2==0){
                sum=sum+arr[i];
            }
        }
        System.out.println("Sum : "+sum);

    }
}