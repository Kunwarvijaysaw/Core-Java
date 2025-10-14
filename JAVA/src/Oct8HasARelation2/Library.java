package Oct8HasARelation2;

public class Library {
	Book book[]=new Book[10];
	int count;

	
	void addBook(Book b) {
		book[count++]=b;
	}
	void showAllBooks() {
		for(int i=0;i<count;i++) {
			book[i].displayBookInfo();
		}
		
	}
	public void searchBook(String title) {
		boolean isFound=false;
		for(int i=0;i<count;i++) {
			if(book[i].getTitle().equalsIgnoreCase(title)) {
				isFound=true;
				break;
			}
			
		}
		if(isFound==true) {
			System.out.println(title+" book is found ");
		}else {
			System.err.println(title+" book is not found ");
		}
		
	}
	void searchBook(String title, String author) {
		boolean isFound=false;
		for(int i=0;i<count;i++) {
			if(book[i].getTitle().equalsIgnoreCase(title) && book[i].getAuthor().equalsIgnoreCase(author) ) {
				isFound=true;
				break;
			}
			
		}
		if(isFound==true) {
			System.out.println(title+" and "+author+" book is found ");
		}else {
			System.err.println(title+" book is not found ");
		}
		
	}

}
