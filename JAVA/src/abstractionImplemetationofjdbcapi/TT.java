package abstractionImplemetationofjdbcapi;

import java.util.Scanner;

public class TT {

	public static void main(String[] args) {

		int no = 145;
		int temp=no;
		int gt=0;
		while (no != 0) {
			int rem = no % 10;
			int total = 1;
			for (int i = 1; i <= rem; i++) {
				total = total * i;

			}
			System.out.println("fact is :" + total);

			no = no / 10;
			gt = gt + total;

		}
		
		if (temp == gt) {
			System.out.println("Arm strong ");
		} else {
			System.out.println("not armstrong");
		}

	}

}
