package Sept29Pattern;
/*
 Q15. Write a program in Java to display the following pattern:
    1
   21
  321
 4321
54321

 */
public class Pattern14 {
	
	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {        //1				2			3			4			5
			for(int j=5;j>=1;j--) {    //5 4 3 2 1		5 4 3 2 1	5 4 3 2 1 	5 4 3 2 1	1 2 3 4 5
				if(j<=i)
				System.out.print(j+" ");
																	//__ __ __ __ 1
				else System.out.print("  ");						//__ __ __  2 1
			}														//__ __  3  2 1
			System.out.println();									//__  4  3  2 1
																	// 5  4  3  2 1 
																	//
		}

	}
}
