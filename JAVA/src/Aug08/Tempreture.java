package Aug08;
 
import java.util.*;
class Tempreture {
	public static void main (String[] args) {
	//create an object for Scanner class
// if you want to take input from user or dynamically then we use Scanner 
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the  temparature:");
		int t=sc.nextInt();
		String result=(t>30)?"Hot day":"Pleasant Day";
		System.out.println(result);
	}

}
