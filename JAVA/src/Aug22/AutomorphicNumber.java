package Aug22;

public class AutomorphicNumber {
	public static void checkAutomorphic(int number) {
		
		int rem = number % 10;
		int sqrt = (int) Math.pow(number, 2);
		int sqrtRem = sqrt % 10;
		System.out.println("Number is : " + number);
		System.out.println("Number is : " + sqrt);
		if (rem == sqrtRem) {
			System.out.println(number + " is an Automorphic Number");
		} else {
			System.out.println(number + "is not an Automorphic Number");
		}
	}

	public static void main(String[] args) {
		checkAutomorphic(625);

	}

}
