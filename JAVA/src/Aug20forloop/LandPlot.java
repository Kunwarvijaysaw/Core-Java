package Aug20forloop;

import java.util.Scanner;

class LandPlot {
	public static void isPerfectSquare(int number) {
	
//		double sqrt = Math.sqrt(number);
//		{
//			int num=(int)sqrt;
//			if(number==(num*num))
//			{
//				System.out.println("Perfect Square");
//			}
//			else {
//				System.out.println("Not Perfect Square");
//			}
			boolean isPerfect=false;
	for(int i=1;i<number;i++) {
		if(number%i==0) {
			if(i*i==number) {
				isPerfect=true;
				break;
			}
			
		}
	}
	
	if(isPerfect)System.out.println("Perfect Square");
	else System.out.println("Not a perfect Square");
	
	}
	
	

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number : ");
		int number=sc.nextInt();
		isPerfectSquare( number);
		
		

	}

}
