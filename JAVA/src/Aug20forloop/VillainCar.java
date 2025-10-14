package Aug20forloop;

public class VillainCar {
	static String brandName;
	static String color;

	public static void main(String[] args) {
		VillainCar.brandName = "Mahindra";
		VillainCar.color = "Black";
		VillainCar v1 = new VillainCar();
		VillainCar v2 = new VillainCar();
		VillainCar v3 = new VillainCar();
		v3.brandName = "Thar";
		v3.color = "Red";
		
		System.out.println("Villain Car Brand Name : "+v1.brandName);
		System.out.println("Villain Car Color Name : "+v1.color);
		
		System.out.println("Villain Car Brand Name : "+v2.brandName);
		System.out.println("Villain Car Color Name : "+v2.color);
		
		System.out.println("Villain Car Brand Name : "+v3.brandName);
		System.out.println("Villain Car Color Name : "+v3.color);
		

	}

}
