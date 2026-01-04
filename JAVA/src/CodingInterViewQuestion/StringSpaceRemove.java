package CodingInterViewQuestion;

public class StringSpaceRemove {

	public static void main(String[] args) {
		String str="in fo sys";
		String s=str.replace(" ", "");
		System.out.println(s);
		System.out.println("==============================");
		String s1 = "Infosys";
		String s2 = "Infosys";

		if(s1.equals(s2))
		    System.out.println("Strings are Equal");
		else
		    System.out.println("Strings are Not Equal");
	}

}
