package Oct8HasARelation;

class BookMainClass {

	public static void main(String[] args) {
		Book b1= new Book("Harry","KK",100);
		Book b2= new Book("tom&Jerry","jk",200);
		Book b3= new Book("comedy","Raju",400);
		Library l1=new Library();
		l1.addBook(b1);
		l1.addBook(b2);
		l1.addBook(b3);
		
		System.out.println(b1.displayBookInfo());
		System.out.println(b2.displayBookInfo());
		System.out.println(b3.displayBookInfo());
		

	}

}
