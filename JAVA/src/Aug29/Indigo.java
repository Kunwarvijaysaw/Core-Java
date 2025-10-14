package Aug29;

class Indigo {

	public static void main(String[] args) {
		Flight f1 = new Flight(1010, 2);
        Flight f2 = new Flight(2020, 3);

        
        f1.bookTicket("KVS");
        f1.bookTicket("Vijay");

       f2.bookTicket("Chunnu");
        f2.bookTicket("Munnu");
        f2.bookTicket("Laxmi");

        
        f1.displayFlightInfo();
        f2.displayFlightInfo();

       
        System.out.println("Total Tickets Booked (All Flight): " + Flight.totalFlightBooked);
	}
}
