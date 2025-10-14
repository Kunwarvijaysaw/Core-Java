package Aug11;
import java.util.Scanner;

class TriangleChecker {
	
	
	    public static void main(String []args){
	        //double sideA,sideB,sideC;
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter Trangle Side A, B and C");
	        double sideA = sc.nextInt();
	        double sideB = sc.nextInt();
	        double sideC = sc.nextInt();

	        if(sideA+sideB<sideC || sideB+sideC<sideA ||sideC+sideA<sideB)
	        {
	            System.out.println("Valid Triangle");
	        }
	        else{
	            System.out.println(" Not a Valid Triangle");
	        }
	    }
	}


