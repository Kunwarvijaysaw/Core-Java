package Aug19forloop;

import java.util.Scanner;

class NaturalNumbersBetweenMAndN {
	 public static void main(String[]args){
	      //  int fn=10,ln=15;
	        Scanner sc =new Scanner(System.in);
			System.out.println("Enter First Number : ");
			int fn = sc.nextInt();
			System.out.println("Enter Last Number : ");
			int ln = sc.nextInt();
	       for(int i=fn;i<=ln;i++){
	        
	           System.out.print(i+" "); 
	         }
	       
		    }

}
