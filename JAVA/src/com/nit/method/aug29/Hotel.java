package com.nit.method.aug29;

class Hotel {
	String hotelName;
	int roomsAvailable=20;
	String lastCustomerName;
	static int totalBookingsAcrossAgoda=0;
	

	public  void bookRoom(String customerName, int nights){
		if(roomsAvailable>0) {
			roomsAvailable--;
			lastCustomerName=customerName;
			totalBookingsAcrossAgoda++;
			System.out.println("Hotel booked for "+customerName+" in nights "+nights);
		}else {
			System.out.println("No Rooms available in this Hotel " + hotelName);
		}
		

	}
	
	void display() {
//		System.out.println("Hotel Name : "+hotelName);
		System.out.println("Last Customer Name : "+lastCustomerName);
		System.out.println("Rooms Available :"+roomsAvailable);
		
	}

}
