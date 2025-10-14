package Sept10;

import java.util.Scanner;

class SpeedMonitor {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SpeedMeter s1= new SpeedMeter();
		 System.out.println("Enter First number : ");
		int speed=sc.nextInt();
		
		System.out.println(s1.checkSpeed(speed));
		
		
	}
}
class SpeedMeter{
	int speed;
	
	
	public  String checkSpeed(int speed) {
		
		if(speed<0) {
            
			return "Invalid speed";
		}else if(speed<80 && speed>0)  {
            return "Speed is within limit";
			
		}else{
            return "Over Speeding";
        }
		
	}
}
