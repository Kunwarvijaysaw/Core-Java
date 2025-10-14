package Aug18LocalVariable;

class Ola {
	 public static void CalculateEarnings(int rides, double farePerRide){
	     double TotalEarnings=rides*farePerRide;
	     if(rides>10) {
	        System.out.println("Total Earnings : Rs. " +(TotalEarnings+500));
	     }  
	     else{
	        System.out.println("Total Earnings : Rs. " +TotalEarnings);
	     }
	    }
	    public static void main(String []args){
	    CalculateEarnings(12,100)  ;  
	    }

}
