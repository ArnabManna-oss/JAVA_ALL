public class BookDemo
{
	public static Book[] booksWithPriceRange(double min,double max,Book[] books)
	{
		int l=books.length;
		Book b[] = new Book[50];int c=0;
		//double max=books[0].getPrice();
		//double min=books[0].getPrice();
//		for(int i=0;i<books.length;i++)
//		{
//			if(books[i].getPrice()>max)
//				max=books[i].getPrice();
//			if(books[i].getPrice()<min)
//				min=books[i].getPrice();
//		}
		for(int i=0;i<l;i++)
		{
			if(books[i].getPrice()<max && books[i].getPrice()>min)
			{
				b[c]=books[i];
				c++;
			}
		}
		return b;
	}
}
