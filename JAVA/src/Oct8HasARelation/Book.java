package Oct8HasARelation;

public class Book {
		String	title ;
		String	author ;
		double	price ;
		public Book(String title, String author, double price) {
			
			this.title = title;
			this.author = author;
			this.price = price;
		}
//		void displayBookInfo() {
//			System.out.println("Title : "+title);
//			System.out.println("Author : "+author);
//			System.out.println("Price : "+price);
//		}
		
		public String displayBookInfo() {
			return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
		}


}
