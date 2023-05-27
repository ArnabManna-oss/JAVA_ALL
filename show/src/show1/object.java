package show1;

//import java.util.Scanner;
public class object {
	int x=0,y=0,z=0;
	object(int a,int b)
	{
		 x=a;
		 y=b;
	}
	object(int a,int b,int c)
	{
		 x=a;
		 y=b;
		 z=c;
	}
	int sum()
	{
		int c=x+y+z;
		return c;
	}
	int sub() {
		int c=sum();
		c=x-y-z;
		return c;
	}
	public static void main(String[] args) {
//Scanner in= new Scanner(System.in);
		object ob=new object(5,10,20);
//		a=in.nextInt();
//		b=in.nextInt();
		System.out.println("sum="+ob.sum()+"  sub="+ob.sub());
	}
}

