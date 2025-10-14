package Sept09;

import java.util.Scanner;
class MovUser {

	public static void main(String[] args) {
		MovieTicket m1= new MovieTicket ();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Movie Name : ");
		m1.setMovieName(sc.nextLine());
		System.out.println("Enter Seat : ");
		m1.setSeatNumber(sc.nextInt());
		
		System.out.println("Enter Ticket Price : ");
		m1.setTicketPrice(sc.nextInt());
		System.out.println("Movie Name  : "+m1.getMovieName());
		System.out.println("Seat Number  : "+m1.getSeatNumber());
		System.out.println("Ticket Price : "+m1.getTicketPrice());
		

	}

}
