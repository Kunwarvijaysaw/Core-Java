package Aug29;

class Bus {
	int busNumber;
	String lastPassengerName;
	 int seatAvailable=10;
	static int totalTicketsBooked = 0;
	
	

	public  Bus(int busNumber) {
		this.busNumber= busNumber;
	}
	public void bookTicket(String passengerName) {
		if(this.seatAvailable>=0) {
			seatAvailable--;
			lastPassengerName=passengerName;
			totalTicketsBooked++;
			System.out.println("Ticket booked for "+passengerName+" in bus No "+busNumber);
		}else {
			System.out.println("No seats available in Bus " + busNumber);
		}
	}
	
	void displayBusInfo() {
        System.out.println("Bus Number: " + busNumber);
        System.out.println("Last Passenger: " + lastPassengerName);
        System.out.println("Seats Available: " + seatAvailable);
        System.out.println("--------------------------");
    }

}




