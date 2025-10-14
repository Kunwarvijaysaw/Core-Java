package Sept18OverLoading;

public class GymTest {
	public static void main(String[] args) {
        GymMember m1 = new GymMember("Vijay");  
        GymMember m2 = new GymMember("Swi", "Premium");
        GymMember m3 = new GymMember("KVSRM", "VIP", "DISC20");

        System.out.println(m1.displayDetails());
        System.out.println();
        System.out.println(m2.displayDetails());
        System.out.println();
        System.out.println(m3.displayDetails());
    }

}
