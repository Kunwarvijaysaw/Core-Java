package Sept24Array;
/*Scenario:
You're developing a ride-sharing app like Uber. When a user requests a ride, the
system must find the closest available driver based on estimated time of arrival (ETA).
ETAs are stored in an array.

Problem Statement:
Write a Java method that takes an array of integers representing ETA (in minutes)
for all available drivers and returns the index of the driver with the shortest ETA.

public int findClosestDriver(int[] etas) {
    // implement logic here
}


Example Input:
[7, 3, 5, 2, 6]
Output:
3 (driver at index 3 has ETA = 2 min)
Sample Input
[7, 3, 5, 2, 6]
Sample Output
3 (driver at index 3 has ETA = 2 min)*/
import java.util.Scanner;
class RideSharingApp{
	
	public void findClosestDriver(int[] etas) {
		int eta=etas[0];
        int pos=0;
		for(int i=0;i<etas.length;i++) {
	    	
	        
	            if(eta>etas[i]){
	                eta=etas[i];
	                pos=i;
	            }
	    }
	        System.out.println(pos+"(driver at index "+pos +" has ETA = "+eta+" min)");
	}
	
	
    public static void main(String []args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter Array length : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter Array "+n+" Element : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        RideSharingApp app = new RideSharingApp();
        app.findClosestDriver(arr);
/*      int eta=arr[1];
        int pos=0;
        for(int i=0;i<n;i++){
            if(eta>arr[i]){
                eta=arr[i];
                pos=i;
            }
        }
        System.out.println(pos+"(driver at index "+pos +" has ETA = "+eta+" min)");
 */
    }
}