package Aug21;

class College {
	static int reg=1000;
	public static void studentRegistration() {
		//int reg=1000;
		reg++;
		System.out.println("Registration No : "+reg);
		
	}

	public static void main(String[] args) {
		studentRegistration();
		studentRegistration();
		

	}

}
