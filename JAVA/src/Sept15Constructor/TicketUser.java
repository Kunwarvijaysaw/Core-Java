package Sept15Constructor;

/*Movie_Ticket_Booking_System
Create a class Ticket with fields movieName, seatNumber, and price.
Use a constructor to initialize all fields.
Add a method printTicket() to display ticket details.

Class Name:
Ticket

Instance Variables:
- movieName (String)
- seatNumber (String)
- price (double)

Constructor:
- Ticket(String movieName, String seatNumber, double price)

Method:
- printTicket() → prints ticket details.

Main Class:
- TicketMain

Input Format:
Movie name (String)
Seat number (String)
Price (double)

Output Format:
Movie: <movieName>, Seat: <seatNumber>, Price: <price>

Note:
Use Scanner with next() for String input.
Sample Input
Inception
A12
12.5
Sample Output
Movie: Inception, Seat: A12, Price: 12.5*/
import java.util.Scanner;

class TicketUser {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Movie Name : ");
		String movieName = sc.next();
		System.out.println("Enter Seat Number : ");
		String seatNumber = sc.next();
		System.out.println("Enter Price : ");
		double price = sc.nextDouble();

		Ticket t1 = new Ticket(movieName, seatNumber, price);

		System.out.println(t1.printTicket());
	}
}

class Ticket {
	String movieName;
	String seatNumber;
	double price;

	Ticket(String movieName, String seatNumber, double price) {
		this.movieName = movieName;
		this.seatNumber = seatNumber;
		this.price = price;

	}

	public String printTicket() {
		return "Movie: " + movieName + ", Seat: " + seatNumber + ", Price: " + price;
	}
}
