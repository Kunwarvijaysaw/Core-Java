package Oct06Array;

import java.util.Arrays;
import java.util.Scanner;

class MakeMyTrip {
	
	
	public static void analyzeFares(double[] fares) {
		double total=0;
		double avg=0;
		for(int i=0;i<fares.length;i++) {
			total=total+fares[i];
		}
		System.out.println("Total : "+total);
		System.out.println("Average Fares : "+total/fares.length);
	}
	public static void findMaxMin(double[] fares) {
		double max=0;
		double min=fares[0];
		for(int i=0;i<fares.length;i++) {
			if(max<fares[i]) {
				max=fares[i];
			}
		}
		System.out.println("Highest Fare : "+max);
		for(int i=0;i<fares.length;i++) {
			if(min>fares[i]) {
				min=fares[i];
			}
		}
		System.out.println("Lowest Fare : "+min);
		
	}
	
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Index Value");
		int n=sc.nextInt();
		double fares[]=new double[n];
		System.out.println("Enter Fares ");
		for(int i=0;i<n;i++) {
			fares[i]=sc.nextDouble();
		}

		analyzeFares(fares);
		findMaxMin(fares);
		
	}

}
