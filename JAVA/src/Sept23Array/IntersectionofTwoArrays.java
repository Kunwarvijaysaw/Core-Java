package Sept23Array;
/*IntersectionofTwoArrays
Scenario 6: Intersection of Two Arrays
Two friends have collected their favorite numbers in arrays A and B
with 5 elements each. Write a program to find common numbers
(intersection) between these two lists.

Sample Input:
A: 1 3 5 7 8
B: 7 4 2 8 9
Sample Output:
T: 7 8
Sample Input
1 3 5 7 8
7 4 2 8 9
Sample Output
T: 7 8*/
import java.util.Scanner;
class IntersectionofTwoArrays{
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
        System.out.print("T: ");
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(a[i]==b[j]){
                   System.out.print(a[i]+" "); 
                }
            }
        }
    }
}