package Aug29;

class Ride {
	int rideId;               
    String captainName;       
    double lastFare;          
    
    static int totalRides = 0; 

   
    public void setRideDetails(int rideId, String captainName) {
        this.rideId = rideId;
        this.captainName = captainName;
    }

    
    public void calculateFare(int distance, int ratePerKm) {
        double fare = distance * ratePerKm; 
        lastFare = fare;
        totalRides++;
        System.out.println("Ride " + rideId + " | Captain: " + captainName +
                           " | Fare: " + fare);
    }

    
    public void displayRideInfo() {
        System.out.println("Ride ID: " + rideId);
        System.out.println("Captain: " + captainName);
        System.out.println("Last Fare: " + lastFare);
        System.out.println("-----------------------------");
    }
}


