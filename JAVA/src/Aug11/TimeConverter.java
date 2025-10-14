package Aug11;
import java.util.Scanner;
	class TimeConverter{
	    public static void main(String []args){
	         Scanner sc=new Scanner(System.in);
	          System.out.println("totalSeconds");
	          int totalSeconds = sc.nextInt();

//	        int totalSeconds = 4000; 
	        int hours = totalSeconds/3600;
	        int remainingSecond = totalSeconds % 3600;
	        int minute = remainingSecond / 60;
	        int remainingSecond2 = remainingSecond % 60;

	        System.out.println(hours+"hours");
	          System.out.println(minute+"minutes");
	            System.out.println(remainingSecond2+"remainingSeconds");

	    }
	}


