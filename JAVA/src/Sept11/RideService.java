package Sept11;

 class RideService {
	public void calculateFare(Ride r) {
		if(r.getDistance()>0) {
			double fare=r.getDistance()*10;
			r.setFare(fare);
			System.out.println("Fare calculated successfully.");
		}else {
			System.out.println("Invalid distance");
		}
	}

}
