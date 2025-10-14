package Sept01;

import java.util.Scanner;

class Library {
	String titleOfBook;
	String authorOfBook;
	boolean status;
	void issueBook() {
		status=true;
		
	}
	void returnBook() {
		status=false;
	}
	void displayBook() {
		System.out.println("======Book Details======");
		System.out.println("Title: "+titleOfBook);
		System.out.println("Author : "+authorOfBook);
		if(status==true) {
			System.out.println("Status:  Available");
		
		}else {
			System.out.println("Status: Issued");
		}
	}

	public static void main(String[] args) {
		Library l1 =new Library();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Title : ");
		l1.titleOfBook=sc.nextLine();
		System.out.println("Enter Author : ");
		l1.authorOfBook=sc.nextLine();
		System.out.println("Status : ");
		l1.status=sc.nextBoolean();

		l1.displayBook();
		
		

	}

}
