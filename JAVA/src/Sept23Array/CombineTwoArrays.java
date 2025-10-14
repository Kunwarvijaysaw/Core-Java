package Sept23Array;
/*Scenario 4: Combine Two Arrays
Given two arrays A and B each containing 5 numbers representing temperatures
in two cities over five days, create an array C of size 10 where the first
five positions contain the values from A, and the last five positions
contain values from B.

Sample Input:
A: 20 21 19 22 24
B: 25 23 22 20 21
Sample Output:
C: 20 21 19 22 24 25 23 22 20 21
Sample Input
20 21 19 22 24
25 23 22 20 21
Sample Output
C: 20 21 19 22 24 25 23 22 20 21*/
import java.util.Scanner;
class CombineTwoArrays{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        for(int i=0;i<5;i++){
            a[i]=sc.nextInt();
        }
        int b[]=new int[5];
        for(int i=0;i<5;i++){
            b[i]=sc.nextInt();
        }
        int c[]=new int[10];
        int index=0;
        for(int i=0;i<5;i++){
            c[index++]=a[i];
        }
        for(int i=0;i<5;i++){
            c[index++]=b[i];
        }

        System.out.print("C: ");
        for(int i=0;i<10;i++){
            System.out.print(c[i]+" ");
        }
    }
}