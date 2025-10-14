package Aug19forloop;

import java.util.Scanner;

class CheckVowelOrNot {
	public static void main(String[]args){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Any Character : ");
		char ch= sc.next().charAt(0);
        //char ch='B';
      if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' ||ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U'){
        System.out.println("Vowel");
      }
      else{
        System.out.println("Consonent");
      }
       
        
    }

}
