package cons;

public class c1 {
	int a=0,b=0,c=0;
	c1(int n,int m)
	{
	    a=n;
	    b=m;
	}
	c1(int n,int m,int o)
	{
	    a=n;
	    b=m;
	    c=o;
	}
	int add()
	{
		return a+b+c;
	}
	public static void main(String[] args) {
		c1 a1=new c1(10,20);
		c1 a2=new c1(10,20,30);
		System.out.println("add ="+a1.add());
		System.out.println("add ="+a2.add());
	}
}