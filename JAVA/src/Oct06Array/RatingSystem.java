package Oct06Array;

import java.util.Arrays;
import java.util.Scanner;

class RatingSystem {
	public static double averageRating(int[] ratings) {
		int total=0;
		int average=0;
		for(int i=0;i<ratings.length;i++) {
			total+=ratings[i];
		}
		average=total/ratings.length;
		return average;
		
	}
	public static int countFiveStars(int[] ratings) {
		int count=0;
		for(int i=0;i<ratings.length;i++) {
			if(ratings[i]==5) {
				count++;
			}
		}
		return count;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many person");
		int n=sc.nextInt();
		int rating[]=new int[n];
		System.out.println("Enter rating (1-5) ");
		for(int i=0;i<n;i++) {
			rating[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(rating));
		System.out.println("Average Rating : "+averageRating(rating));
		System.out.println("5-Star Ratings: "+countFiveStars(rating));

	}

}
