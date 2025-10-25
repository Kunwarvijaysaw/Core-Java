package com.nit.getter_setter.sept12;

import java.util.Scanner;

class MovieUser{
	public static void execute(Scanner sc, MovieTicket m) {
		System.out.println("Enter Movie Name : ");
		String movieName=sc.nextLine();sc.nextLine();
		System.out.println("Enter Seat Number : ");
		int seatNumber=sc.nextInt();
		System.out.println("Enter Ticket Price : ");
		double ticketPrice=sc.nextDouble();sc.nextLine();
		
		m.setMovieName(movieName);
		m.setSeatNumber(seatNumber);
		m.setTicketPrice(ticketPrice);
		System.out.println(m.getDisplay());
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter How many Object");
		int n=sc.nextInt();
for(int i=1;i<=n;i++) {
	MovieTicket m1=new MovieTicket();
	execute(sc, m1);
}
		
//		MovieTicket m1=new MovieTicket();
//		MovieTicket m2=new MovieTicket();
//		MovieTicket m3=new MovieTicket();
//		
//		execute(sc, m1);
//		execute(sc, m2);
//		execute(sc, m3);
		
		
		
	}
}

