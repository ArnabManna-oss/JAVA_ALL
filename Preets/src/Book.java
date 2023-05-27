import java.util.Scanner;
public class Book 
{
    private int id; 
    private String title;
    private String author;
    private double price;
    
    public Book() {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public static Book[] booksWithPriceRange(double min,double max,Book[] books)
	{
		int l=books.length;
		int c=0;
		for(int i=0;i<l;i++)
		{
			
			if(books[i].getPrice()<max && books[i].getPrice()>min)
			{
				
				c++;
			}
		}
		Book b[]=new Book[c];
		c=0;
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


