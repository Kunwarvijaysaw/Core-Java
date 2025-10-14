package Aug18LocalVariable;

class SbiBank {
	public static void  FdInterestCalculator(double principal, double rate, int years){
        double interest = (principal * rate * years) / 100;
        System.out.println("Total Interest: Rs. "+interest);
    }
    public static void main(String []args){
        FdInterestCalculator(50000,6.5,5);
    }

}
