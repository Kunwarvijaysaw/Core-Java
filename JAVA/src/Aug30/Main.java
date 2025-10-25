package Aug30;

class Main {
	static int num1;
	static int num2;
	static int num3;
	int sum;
	int diff;

	public static void add(int num1, int num2, int num3) {

		double sum = num1 + num2 + num3;
		System.out.println("Sum : " + sum);
	}

	public static void diff(int num1, int num2, int num3) {

		double diff = (num1 + num2) - num3;
		System.out.println("diff : " + diff);
	}

	public static void main(String[] args) {

		add(5, 6, 8);

		diff(5, 8, 4);

	}

}
