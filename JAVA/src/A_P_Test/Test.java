package A_P_Test;

import static java.lang.System.out;
//public class Test {

//	public static void main(String[] args) {
//		out.print("Kunwar Vijay Saw");
//	}
//
//}

public class Test {

	public static void main(String[] args) {
		String str = "Java";
		String reversed = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			reversed += str.charAt(i);
		}

		System.out.println("Reversed String: " + reversed);
	}
}