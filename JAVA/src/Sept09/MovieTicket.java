package Sept09;

class MovieTicket {
	private String movieName;
	private int seatNumber;
	private double ticketPrice;

	public void setMovieName(String movieName) {
		if (movieName != null && !movieName.trim().isEmpty()) {
            this.movieName = movieName.trim();
		}
            else {
			System.err.println("Enter valid input ");
			System.exit(0);
		}

	}

	public void setSeatNumber(int seatNumber) {
		if (seatNumber > 0) {
			this.seatNumber = seatNumber;
		} else {
			System.err.println("Enter valid input ");
		}

	}

	public void setTicketPrice(double ticketPrice) {
		if (ticketPrice > 0) {
			this.ticketPrice = ticketPrice;
		} else {
			System.err.println("Enter valid input ");
		}

	}

	public String getMovieName() {
		return movieName;
	}

	public int getSeatNumber() {
		return seatNumber;
	}

	public double getTicketPrice() {
		return ticketPrice;
	}

}
