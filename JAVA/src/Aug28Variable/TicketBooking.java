package Aug28Variable;

class TicketBooking {
	String name;
	String sourceCity;
	String destinationCity;
	int ticket;
	float pricePerTicket;

	public  void calculateFare(String name,String sourceCity,String destinationCity,int ticket,float pricePerTicket) {
		this.name = name;
		this.sourceCity = sourceCity;
		this.destinationCity = destinationCity ;
		this.ticket = ticket;
		this.pricePerTicket = pricePerTicket;
		

	}
	public void displayBookingDetails() {
		System.out.println(" ====== Passenger Details===== ");
		System.out.println(" Passenger Name : "+name);
		System.out.println(" From : "+sourceCity);
		System.out.println(" To : "+destinationCity);
		System.out.println(" Ticket : "+ticket);
		System.out.println(" Price Per Ticket : "+pricePerTicket);
		System.out.println(" Total Fare : "+(pricePerTicket*ticket));
		System.out.println("======Thank You 😊😊❤️====== ");
	}

}
