package Sh;

public class ok implements Runnable
{
	String str1,str2;
	public void run() {
		for(int i=0;i<10;i++)
		{
			str1="Welcome";
			str2="to Java";
			System.out.println(str1+" "+str2+" ");
		}
	}
	public static void main(String[] args) {
		ok run=new ok();
		Thread obj1=new Thread(run);
		Thread obj2=new Thread();
		obj1.start();
		obj2.run();

	}

}
