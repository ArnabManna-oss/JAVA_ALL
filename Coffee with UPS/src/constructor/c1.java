package constructor;
import java.util.*;

public class c1 {
	
	int add(int a,int b)
	{
		return a+b;
	}
	
	int sub(int a,int b)
	{
		return a-b;
	}
	public static void main(String[] args) {
		int a=10,b=6;
		c1 obj=new c1();
		System.out.println("add ="+obj.add(a,b));
		System.out.println("sub="+obj.sub(a,b));
	}
}
