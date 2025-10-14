package Aug7;
class Calculation {
	public static void main(String[] args) {
		int a = 20, b = 10;
		char ch = '+';

		switch (ch) {

		case '+': {
			System.out.println("Sum of a and b = " + (a + b));
			break;
		}
		case '-': {
			System.out.println("Sub of a and b = " + (a - b));
			break;
		}
		case '*': {
			System.out.println("Mul of a and b = " + (a * b));
			break;
		}
		case '/': {
			System.out.println("Devide of a and b = " + (a / b));
			break;
		}
		case '%': {
			System.out.println("Reminder of a and b = " + (a % b));
			break;
		}
		default: {
			System.out.println("inavalid  opration");
		}
		}
	}
}
