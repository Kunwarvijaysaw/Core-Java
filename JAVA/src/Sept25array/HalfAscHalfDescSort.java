package Sept25array;
/*HalfAscHalfDescSort
Q4. There are 100 elements in an array, Write a program in JAVA to arrange first 50 elements of the array in ascending order and rest 50 elements into descending order.
Sample Input
12 5 7 2 19   33 1 90 17 45
Sample Output
Array after arranging:
2 5 7 12 19 90 45 33 17 1*/
import java.util.Scanner;
class HalfAscHalfDescSort{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=10;
        int arr[]=new int[n];
        System.out.println("Enter Array Element : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n/2;i++)
        {
             for(int j=0;j<n/2;j++)
            {
                 if(arr[i]<arr[j])
                    {
                        int x=arr[i];
                        arr[i]=arr[j];
                        arr[j]=x;
                    }
            }
        }
         for(int i=n/2;i<n;i++)
        {
             for(int j=n/2;j<n;j++)
            {
                 if(arr[i]>arr[j])
                    {
                        int x=arr[i];
                        arr[i]=arr[j];
                        arr[j]=x;
                    }
            }
        }
       
        System.out.println("Array after arranging:");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        
    }
}

