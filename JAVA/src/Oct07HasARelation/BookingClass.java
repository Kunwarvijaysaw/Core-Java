package Oct07HasARelation;

class BookingClass {
	private String userName;
	private String destination;
	private TravelPlan travelPlan;
	public BookingClass(String userName, String destination, TravelPlan travelPlan) {
	
		this.userName = userName;
		this.destination = destination;
		this.travelPlan = travelPlan;
	}
	public String displayBookingDetails() {
		return "User Name : "+userName+
				"\nDestination : "+destination+
				"\nDistance : "+travelPlan.displayPlan();
	}
	
	
}
