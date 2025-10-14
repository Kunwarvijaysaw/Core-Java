package Sept25array;
/*ShoppingApp
Q5.Sorting Prices in a Shopping Cart
Scenario:
A shopping app needs to sort the prices of items in a user's cart in ascending
order before applying discounts.

Problem Statement:
Implement bubble sort to sort the prices.

Sample Input:
prices = [1200, 450, 999, 3500, 299]

Sample Output:
[299, 450, 999, 1200, 3500]*/
import java.util.Scanner;
class ShoppingApp{
	public static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
		}
	}
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array Length : ");
        int n=sc.nextInt();
       
        int arr[]=new int[n];
        System.out.println("Enter "+n+" Array Element :");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        System.out.println("Prices in ascending order:");
        printArray(arr);
//        for(int i=0;i<n;i++){
//            System.out.print(arr[i]+" ");
//        }
    }
}