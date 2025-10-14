package Sept09;

import java.util.Scanner;

class FindLargeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Compare c1= new Compare();
      
		
		
		 System.out.println("Enter First number : ");
		c1.num1=sc.nextInt();
		 System.out.println("Enter Second number : ");
		c1.num2=sc.nextInt();
		System.out.println(c1.findLarge());
		
		
	}
}
	class Compare{
		int num1;
		int num2;
		
		public  String findLarge() {
			
			if(num1>num2) {
				return "First number is greater";
			}else if(num1==num2){
				return "Both numbers are equal";
			}else {
				return "Second number is greater";
			}
			
		}
	}


