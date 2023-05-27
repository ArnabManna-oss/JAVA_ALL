
public class BookDemo
{
	public static Book[] booksWithPriceRange(Book[]books)
	{
		Book b=null;
		double max=books[0].getPrice();
		double min=books[0].getPrice();
		for(int i=0;i<books.length;i++)
		{
			if(books[i].getPrice()>max)
				max=books[i].getPrice();
			if(books[i].getPrice()<min)
				min=books[i].getPrice();
			if(books[i].getPrice()<max && books[i].getPrice()>min)
				b=books[i];
		}
		return b;
	}
}
