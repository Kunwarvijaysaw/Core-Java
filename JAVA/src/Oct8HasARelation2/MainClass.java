package Oct8HasARelation2;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter No of Book ");
		int n=sc.nextInt();
		Library library=new Library();
		for(int i=0;i<n;i++) {
			System.out.println("Enter the book title");
			String title=sc.next();
			System.out.println("Enter the author name");
			String author=sc.next();
			System.out.println("Enter the price of the book");
			int price=sc.nextInt();
			Book book=new Book(title, author, price);
			
			library.addBook(book);
		}
		library.showAllBooks();
		System.out.println("Enter Title of the Book for Search ");
		String title=sc.next();
		library.searchBook(title);
		System.out.println("Enter Title of the Book for Search ");
		String title1=sc.next();
		System.out.println("Enter TAuthor of the Book for Search ");
		String author=sc.next();
		library.searchBook(title1,author);
	}

}
