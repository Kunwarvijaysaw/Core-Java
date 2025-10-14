package Sept23Array;
/*MergeArraysbyPositionType
Scenario 5: Merge Arrays by Position Type
Two arrays A and B contain 5 numbers each representing morning and
evening temperatures for five days. Create an array C of size 10
such that elements at odd positions in C are from A, and elements at
even positions in C are from B.

Sample Input:
A: 15 16 17 18 19
B: 20 21 22 23 24
Sample Output:
C: 15 20 16 21 17 22 18 23 19 24
Sample Input
A: 15 16 17 18 19
B: 20 21 22 23 24
Sample Output
C: 15 20 16 21 17 22 18 23 19 24*/
import java.util.Scanner;
class MergeArraysbyPositionType{
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
        int c[]=new int[5];
//        int index=0;
        for(int i=0;i<5;i++){
            c[i]=a[i]+b[i];
           

        }
        System.out.print("C: ");
        for(int i=0;i<5;i++){
            System.out.print(c[i]+" ");
        }
    }
}