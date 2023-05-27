import java.util.Scanner;

public class Solution 
{
	public static void main(String[] args)
    {
    	Scanner in=new Scanner(System.in);
    	Book books[] = new Book[4];
    	Book b1[] = new Book[4];
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
    	int max,min;
    	
    	System.out.println("enter max =");
    	max=in.nextInt();
    	System.out.println("enter min =");
    	min=in.nextInt();
    	b1=Book.booksWithPriceRange(min,max,books);
    	System.out.println("Id\t\tTitle\t\t\tAuthor\t\tPrice");
    	for(int i=0;i<b1.length;i++)
    		System.out.println(b1[i].getId()+"\t\t"+b1[i].getTitle()+"\t\t\t"+b1[i].getAuthor()+"\t\t"+b1[i].getPrice());
    	
    }
}
