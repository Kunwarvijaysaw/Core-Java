package Pattern;

import java.util.Scanner;
public class test33 {
    public static void main (String []args){
        Scanner sc = new Scanner (System.in);
        System.out.println("enetr your no");
        long no=sc.nextLong();
        int count=0;
        if (no<0){
            System.out.println("Invalid No!");
            System.exit(0);
        }else if(no==0) {
        	System.out.println("Number is Zere");
        	System.exit(0);
        	
        }
        else {
            while(no>0){
                count++;
                no=no/10;
            }
        }
         System.out.println("Total count no : "+count);
        }
    }