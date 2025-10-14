package Sept12;

import java.util.Scanner;

class MovieTicket {
	
	private String movieName ;
	private int seatNumber;
	private double ticketPrice;
	
	
	public void setMovieName(String movieName) {
		this.movieName=movieName;
	}
	
	public void setSeatNumber(int seatNumber) {
		this.seatNumber=seatNumber;
	}
	
	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice=ticketPrice;
	}
	
	public String getMovieName() {
		return movieName;
	}
	
	public int  getSeatNumber() {
		return seatNumber;
	}
	public double getTicketPrice() {
		return ticketPrice;
	}
	
	public String getDisplay() {
		System.out.println("======Movie Details======");
		return "Movie Name : "+movieName+
				"\n Seat Number : "+seatNumber+
				"\n Ticket Price : "+ticketPrice;
	}
	
}

