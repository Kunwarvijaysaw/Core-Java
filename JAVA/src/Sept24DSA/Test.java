package Sept24DSA;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Array Length : ");
		int n=sc.nextInt();
		String name[]=new String[n];
		sc.nextLine();
		
		System.out.println("Enter Array Element : ");
		for(int i=0;i<n;i++) {
			System.out.println("Name :"+i);
			name[i]=sc.nextLine();
			
		}
		System.out.println(Arrays.toString(name));

	}

}
