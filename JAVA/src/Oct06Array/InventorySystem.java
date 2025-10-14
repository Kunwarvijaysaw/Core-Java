package Oct06Array;

import java.util.Scanner;

class InventorySystem {

	public static boolean isAnyOutOfStock(int[] quantities) {
		if(calculateTotalStock(quantities)>0) {
			return true;
		}else {
			return false;
		}
	}
	public static int calculateTotalStock(int[] quantities) {
		int total=0;
		
		for(int i=0;i<quantities.length;i++) {
			total=total+quantities[i];
		}
		
	return total;
	}

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Index Value");
		int n=sc.nextInt();
		int quantities[]=new int[n];
		System.out.println("Enter Quantity ");
		for(int i=0;i<n;i++) {
			quantities[i]=sc.nextInt();
		}
		if(isAnyOutOfStock(quantities)==true) {
			System.out.println("Any Item Out of Stock: Yes");
		}else {
			System.out.println("Any Item Out of Stock: No");
		}
		System.out.println("Total Available Stock: "+calculateTotalStock(quantities));

	}

}
