package Aug29;

class Flight {
	int flightNumber;
	String lastPassengerName;
	int seatAvailable=50;
	static int totalFlightBooked = 0;
	

	public Flight(int flightNumber,int seatAvailable) {
		this.flightNumber=flightNumber;
//		this.seatAvailable=seatAvailable;
	}
	public void bookTicket(String passengerName) {
		if(this.seatAvailable>=0) {
			seatAvailable--;
			lastPassengerName=passengerName;
			totalFlightBooked++;
			System.out.println("Ticket booked for "+passengerName+" in Flight No "+flightNumber);
		}else {
			System.out.println("No seats available in Bus " + flightNumber);
		}
	}
	
	void displayFlightInfo() {
        System.out.println("Flight  Number: " + flightNumber);
        System.out.println("Last Passenger: " + lastPassengerName);
        System.out.println("Seats Available: " + seatAvailable);
        
    }
	

}
