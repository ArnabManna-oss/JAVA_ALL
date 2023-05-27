package OOPS;

import java.util.Scanner;

public class Solution_ 
{
	public static void main(String[] args)
    {
    	Scanner in=new Scanner(System.in);
    	Cake cakes[] = new Cake[5];
    	Cake c[] = new Cake[5];
    	for(int i=0;i<5;i++)
    	{
    		cakes[i]=new Cake();
    		System.out.println("Enter the record for Book : "+(i+1));
    		System.out.println("Enter the ID : ");
        	int id=in.nextInt();
        	in.nextLine();
        	System.out.println("Enter the name of the Cake : ");
        	String name=in.nextLine();
        	System.out.println("Enter the number of Pound : ");
        	int pound=in.nextInt();
        	System.out.println("Enter the Price per pound : ");
        	double price=in.nextDouble();
        	System.out.println("Enter the whether the cake is eggless or not? : ");
        	boolean eggless=in.nextBoolean();
        	cakes[i].setCakeId(id);
        	cakes[i].setCakeName(name);	
        	cakes[i].setPound(pound);
        	cakes[i].setPriceperpound(price);
        	cakes[i].setEggless(eggless);
    	}
    	System.out.println("Id\t\tName\t\t\tPound\t\tPrice per Pound\t\tEggless");
    	for(int i=0;i<5;i++)
    		System.out.println(cakes[i].getCakeId()+"\t\t"+cakes[i].getCakeName()+"\t\t\t"+cakes[i].getPound()+"\t\t"+cakes[i].getPriceperpound()+"\t\t"+cakes[i].isEggless());
    	double bill=CakeDemo.generateBill(cakes);
    	System.out.println(bill);
    	
    	
    	
    }
}