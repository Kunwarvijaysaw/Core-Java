package Sept24Array;
/*3. Fitness App - Step Tracker Statistics
------------------------------------------
Scenario:
In a fitness tracking app, users' steps over the past 7 days are recorded in an
array. You need to find the no. of days when the user met the goal
(goal: 10,000 steps).
Problem Statement:
Write a Java method that displays:
The number of days when steps were ≥ 10,000.

public void analyzeStepData(int[] weeklySteps) {
    // Print average steps
    // Print number of days with 10,000 and above steps
}

Example Input:
[12000, 8000, 15000, 10000, 7000, 11000, 9000]
Output:
Goal Days: 4
Sample Input
Example Input:
[12000, 8000, 15000, 10000, 7000, 11000, 9000]
Sample Output
Output:
Goal Days: 4*/
import java.util.Scanner;
class FitnessApp{
    public static void main(String []args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter arry length :");
        int n=sc.nextInt();
        System.out.println("Enter arry Element :");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]>=10000){
                count++;
            }
        }
        System.out.println("Goal Days: "+count);
    }
}