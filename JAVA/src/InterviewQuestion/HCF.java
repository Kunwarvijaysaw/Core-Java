package InterviewQuestion;

import java.util.Scanner;

class HCF {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Emnter Num1 : ");
		int Num1 =sc.nextInt();		
		System.out.println("Enter Num2 : ");
		int Num2 = sc.nextInt();
		int hcf=1;
		for(int i=1;i<=Num1 && i<=Num2;i++) {
			if(Num1%i==0 && Num2%i==0) {
				hcf=i;
			}
		}
		System.out.println("HCF OF "+Num1+" and "+Num2+" : "+hcf);

	}

}
