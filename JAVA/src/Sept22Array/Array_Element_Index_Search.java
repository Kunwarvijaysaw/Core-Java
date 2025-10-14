package Sept22Array;
/*Search element in an Array
Problem:
Accept n integers in an array and a number to search.check if the number
exists, and print its index if found.

Sample Input:
Array: 12 23 34 45 56 78
Search Value : 45

Sample Output:
Number found at index 3.
Sample Input
Array: 12 23 34 45 56 78
Search Value : 45
Sample Output
Number found at index 3.*/
 import java.util.Scanner;
class Array_Element_Index_Search{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Total no of iteam in arry : ");
        int n=sc.nextInt();
        System.out.println("enter arry element : ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();  
        }
        System.out.println("Enter Number find index : ");
        int e =sc.nextInt();
        int flag=0;
        for(int i=0;i<n;i++){
            if(e==arr[i]){
                System.out.println("Number found at index "+i+".");
                System.exit(0);
            }else{
              flag=1;  
            }
            
        }
        if(flag==1){
            System.out.println("Number not found in array.");
        }
    }
}