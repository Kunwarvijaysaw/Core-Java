package Sept15Constructor;
/*FlightBookingSystem
Create a class FlightTicket with fields for passengerName, destination, and seatClass.
Initialize them using a constructor.
Add a method printTicketSummary() to display the ticket details.

Class Name:
FlightTicket

Instance Variables:
- passengerName (String)
- destination (String)
- seatClass (String)

Constructor:
- FlightTicket(String passengerName, String destination, String seatClass)

Method:
- printTicketSummary() → prints ticket summary

Main Class:
- FlightMain

Input Format:
Passenger Name (String)
Destination (String)
Seat Class (String)

Output Format:
Passenger: <passengerName>, Destination: <destination>, Class: <seatClass>

Note:
Use Scanner with next() for String input.
Sample Input
John
Paris
Economy
Sample Output
Passenger: John, Destination: Paris, Class: Economy*/

import java.util.Scanner;

class FlightUser {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Passenger Name : ");
		String passengerName = sc.next();
		System.out.println("Enter Destination : ");
		String destination = sc.next();
		System.out.println("Enter Seat Class : ");
		String seatClass = sc.next();

		FlightTicket f1 = new FlightTicket(passengerName, destination, seatClass);

		System.out.println(f1.printTicketSummary());
	}
}

class FlightTicket {
	String passengerName;
	String destination;
	String seatClass;

	FlightTicket(String passengerName, String destination, String seatClass) {
		this.passengerName = passengerName;
		this.destination = destination;
		this.seatClass = seatClass;

	}

	public String printTicketSummary() {
		return "Passenger: " + passengerName + ", Destination: " + destination + ", Class: " + seatClass;
	}
}
