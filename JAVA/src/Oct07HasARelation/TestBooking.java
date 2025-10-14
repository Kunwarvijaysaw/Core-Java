package Oct07HasARelation;

class TestBooking {


	public static void main(String[] args) {
		TravelPlan t1=new TravelPlan(5);
		BookingClass b1= new BookingClass("KVS", "Goa", t1);
		System.out.println(b1.displayBookingDetails());
		

	}

}
