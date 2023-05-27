package OOP;

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

	public static Cake[] getEgglessCake(Cake[] c) {
		// TODO Auto-generated method stub
		int count=0;
    	for(int i=0;i<c.length;i++)
		{
			if(c[i].isEggless()==true)
				count++;
		}
    	Cake eglCake[]=new Cake[count];
    	count=0;
    	for(int i=0;i<c.length;i++)
		{
			if(c[i].isEggless()==true)
			{
				eglCake[count]=c[i];
				count++;
			}			
		}
    	return eglCake;
	}
}