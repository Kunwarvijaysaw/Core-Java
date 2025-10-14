package Sept23Array;
/*Scenario 3: Sum of Corresponding Elements
You have two lists of weekly sales figures, A and B, each containing 5 values.
Combine these to create a third list C where each element is the sum of the
corresponding elements from A and B.

Sample Input:
A: 10 20 30 40 50
B: 1 2 3 4 5
Sample Output:
C: 11 22 33 44 55
Sample Input
10 20 30 40 50
1 2 3 4 5
Sample Output
C: 11 22 33 44 55*/
import java.util.Scanner;
class SumofCorrespondingElements{
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
        int index=0;
        for(int i=0;i<5;i++){
            c[i]=a[i]+b[i];
           

        }
        System.out.print("C: ");
        for(int i=0;i<5;i++){
            System.out.print(c[i]+" ");
        }
    }
}