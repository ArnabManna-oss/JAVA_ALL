package OOPS;

public class CakeDemo
{
	public static double generateBill(Cake[] c)
	{
		double price=0,count=0;
		for(int i=0;i<c.length;i++)
		{
			price+=c[i].getPriceperpound();
			if(c[i].isEggless()==true)
				count++;
		}
		price+=count*50;
		price+=price*0.02;
		return price;
	}
    public static Cake[] getEgglessCake(Cake[] c)
    {
    	
    }
}
