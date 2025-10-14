package Aug19forloop;

import java.util.Scanner;

class CountEvenAndOddNumbers {
	 public static void main(String[]args){
	       // int fn=1,ln=10;
	        int	E_Count=0,O_Count=0;
	        Scanner sc =new Scanner(System.in);
			System.out.println("Enter First Number : ");
			int fn = sc.nextInt();
			System.out.println("Enter Last Number : ");
			int ln = sc.nextInt();
			
	       for(int i=fn;i<=ln;i++){
	        if(i%2==0)
	        {
	            E_Count++;
	            
	            
	        }else{
	            O_Count++;
	           
	            
	        }
	         }
	           System.out.println("Even Number : "+E_Count); 
	           System.out.println("Odd Number : "+O_Count);
	        
	    }

}
