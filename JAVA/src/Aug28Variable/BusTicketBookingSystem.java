package Aug28Variable;

import java.util.Scanner;

class BusTicketBookingSystem {

	public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
		
 		TicketBooking t1 = new TicketBooking();
		System.out.println("Enter Passenger Name : ");
		String name = sc.nextLine();
		System.out.println("Enter Source City : ");
		String sourceCity = sc.nextLine();
		System.out.println("Enter Destination City : ");
		String destinationCity = sc.nextLine();
		System.out.println("Enter No. of Tickets: ");
		int ticket = sc.nextInt();
		System.out.println("Enter Price of  Per Tickets: ");
		float pricePerTicket = sc.nextFloat();
		t1.calculateFare(name, sourceCity, destinationCity, ticket, pricePerTicket);
		t1.displayBookingDetails();

	}

}
