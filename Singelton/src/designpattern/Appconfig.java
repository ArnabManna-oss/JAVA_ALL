package designpattern;

public class Appconfig {
	
	private  Appconfig() {

	}
	private static Appconfig obj=null;
	
	public static Appconfig getInstance() 
	{
	
			if (obj==null) 
			{
				obj=new Appconfig();
			}
			return obj;
	}
}
