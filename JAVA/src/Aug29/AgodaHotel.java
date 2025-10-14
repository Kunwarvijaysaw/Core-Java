package Aug29;

import java.util.Scanner;

class AgodaHotel {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		Hotel h1 =new Hotel();
		Hotel h2 =new Hotel();
		h1.bookRoom("kk",6);
		h1.display();
		
		h2.bookRoom("raja",2);
		h2.display();
		 System.out.println("Total Room Booked (All Hotel): " +Hotel. totalBookingsAcrossAgoda);
		
	
		

	}	

}
