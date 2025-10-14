package Oct07HasARelation;

class MainClass {

	public static void main(String[] args) {
		Engine e1=new Engine("V6 Hybrid");
		Car c1=new Car("Hyundai", "Camry", e1);
		System.out.println(c1.displayCarDetails());

	}

}
