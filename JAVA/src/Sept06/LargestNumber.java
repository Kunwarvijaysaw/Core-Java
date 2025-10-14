package Sept06;
/* WAP to declare a method take two integer and return largest value*/

import java.util.Scanner;

class LargestNumber {
	
		public static String  findLargeNumber(int a,int b) {
			if(a>b) {
				return (a+" a is big");
				
			}else if(a==b) {
				return (a+" and "+b+" both are equal");
			}else {
				return (b+" b is big");
			}
			
			
		}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		int a=sc.nextInt();
		System.out.println("Enter Second Number");
		int b=sc.nextInt();

		
		System.out.println(findLargeNumber(a,b));
	}

}
