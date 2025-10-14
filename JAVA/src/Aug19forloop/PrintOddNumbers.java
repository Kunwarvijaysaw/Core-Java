package Aug19forloop;

import java.util.Scanner;

class PrintOddNumbers {
	public static void main(String[]args){
//        int fn=5;
//        int ln=15;
        Scanner sc =new Scanner(System.in);
		System.out.println("Enter First Number : ");
		int fn = sc.nextInt();
		System.out.println("Enter Last Number : ");
		int ln = sc.nextInt();
        for(int i=fn;i<=ln;i++){
            if(i%2!=0){
            System.out.print(i+" ");
        }
        }
    }

}
