package Sept29Pattern;
/*
 * Q16. Write a program in Java to display the following pattern:
   1
  31
 531
7531
*/
public class Pattern15 {
	
public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			int c=i*2-1;
			for(int j=5;j>=1;j--) { 
				
//				
				if(j<=i)
				{
					System.out.print((c )+" ");
					c-=2;
				}
																	
				else
					System.out.print("  ");	
				
			}	
			
		
			System.out.println();									
																	
																	//
		}

	}

}
