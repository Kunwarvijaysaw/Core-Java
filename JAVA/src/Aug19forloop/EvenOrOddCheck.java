package Aug19forloop;

import java.util.Scanner;

class EvenOrOddCheck {
	public static void main(String[]args){
       // int n=3;
		 Scanner sc =new Scanner(System.in);
			System.out.println("Enter a Number : ");
			int n = sc.nextInt();
			
       
        if(n%2==0)
        {
             System.out.print("Even");
        }else{
            System.out.print("Odd");
        }
           
        
    }

}
