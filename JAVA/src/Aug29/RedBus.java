package Aug29;

class RedBus {
	public static void main(String[] args) {
		Bus bus1 = new Bus(101);
        Bus bus2 = new Bus(202);

        
        bus1.bookTicket("KVS");
        bus1.bookTicket("Vijay");

        bus2.bookTicket("Chunnu");
        bus2.bookTicket("Munnu");
        bus2.bookTicket("Laxmi");

        
        bus1.displayBusInfo();
        bus2.displayBusInfo();

       
        System.out.println("Total Tickets Booked (All Buses): " + Bus.totalTicketsBooked);
	}

}
