package ups;

import java.util.*;

public class factorial {
	
	int fact(int n)
	{
		int f=1,i;
		for(i=1;i<=n;i++)
		{
			f=f*i;
		}
		return f;
	}
	
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		factorial ob=new factorial();
		
		int n,f;
		System.out.println("give some gal to nik !");
		n=in.nextInt();
		
		f=ob.fact(n);
		System.out.println("factorial ="+f);
	}
}
