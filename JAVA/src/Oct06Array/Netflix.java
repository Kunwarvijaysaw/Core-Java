package Oct06Array;

import java.util.Scanner;

class Netflix {
	int time;
	static double total=0;
	double average=0;
	
	public static double calculateAverageWatchTime(int[] time) {
		for(int i=0;i<time.length;i++) {
			total=total+time[i];
		}
		return total/time.length;
		
	}
	
	public static int findMostWatchedEpisode(int[] time) { // Return index
	int max=0;
	for(int i=0;i<time.length;i++) {
		if(max<time[i]) {
			max=time[i];
		}
		
	}
	return max;
	}
	public static int getIndex(int value,int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			if(value==arr[i])
			{
				return i;
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size: ");
		int n=sc.nextInt();
		int[] time=new int[n];
		for(int i=0;i<n;i++) {
			time[i]= sc.nextInt();
		}
		
		System.out.println("Average Watch Time: "+calculateAverageWatchTime(time));
		System.out.println("Most Watched Episode: Episode No = "+(getIndex(findMostWatchedEpisode(time),time)+1)+", Watch Time "+findMostWatchedEpisode(time));

	}

}
