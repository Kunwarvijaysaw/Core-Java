package Oct8HasARelation;

public class Library {
	Book[] book=new Book[100];
	int count=0;
	
	public void addBook(Book b)
	{
		book[count++]=b;
	}
	public void showAllBook()
	{
		for(Book b:book)
		{
			b.displayBookInfo();
		}
	}
	public void serachBook(String title)
	{
		boolean bb=false;
		for(Book b:book)
		{
			if(b.title.equals(title))
			{
				b.displayBookInfo();
				bb=true;
			}
			
		}
		if(bb==false)
		{
			System.out.println("Book not found");
		}
	}
	public void serachBook(String title,String author)
	{
		boolean bb=false;
		for(Book b:book)
		{
			if(b.title.equals(title)&&b.author.equals(author))
			{
				b.displayBookInfo();
				bb=true;
			}
			
		}
		if(bb==false)
		{
			System.out.println("Book not found");
		}
	}

}
