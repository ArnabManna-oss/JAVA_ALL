
import java.util.Scanner;

public class Solution 
{
    public static void main(String args[] )
    {
    	Scanner in=new Scanner(System.in);
    	Book books[] = new Book[4];
    	for(int i=0;i<4;i++)
    	{
    		books[i]=new Book();
    		System.out.println("Enter the record for Book : "+(i+1));
    		System.out.println("Enter the ID : ");
        	int id=in.nextInt();
        	in.nextLine();
        	System.out.println("Enter the Title : ");
        	String title=in.nextLine();
        	System.out.println("Enter the Author's name : ");
        	String author=in.nextLine();
        	System.out.println("Enter the Price : ");
        	double price=in.nextDouble();
        	books[i].setId(id);
        	books[i].setTitle(title);
        	books[i].setAuthor(author);
        	books[i].setPrice(price);	
    	}
    	System.out.println("Id\t\tTitle\t\t\tAuthor\t\tPrice");
    	for(int i=0;i<4;i++)
    		System.out.println(books[i].getId()+"\t\t"+books[i].getTitle()+"\t\t\t"+books[i].getAuthor()+"\t\t"+books[i].getPrice());
    	BookDemo ob=new BookDemo();
    	ob.booksWithPriceRange(books);
    }
}
