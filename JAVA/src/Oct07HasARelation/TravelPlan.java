package Oct07HasARelation;

public class TravelPlan {
	private int distanceInKm;

	public TravelPlan(int distanceInKm) {
	if(distanceInKm<=0) {
		System.out.println("Invalid");
		System.exit(0);
	}else {
		this.distanceInKm = distanceInKm;
	}
	}
	public int getDistanceInKm() {
		return distanceInKm;
	}

	public void setDistanceInKm(int distanceInKm) {
		this.distanceInKm = distanceInKm;
	}
	public int displayPlan() {
		return distanceInKm;
	}

}
