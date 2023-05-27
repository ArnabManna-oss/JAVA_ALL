package exception;
import java.util.*;
public class Main {
	
	static void exc(int time) throws UpsException
	{
		if(time<11)
			System.out.println("Hu");
		else {
			throw new UpsException();
		}
	}
	public static void main(String[] args) throws UpsException {
		Scanner in= new Scanner(System.in);
		
		int time,t1;
		System.out.println("enter the time:");
		time=in.nextInt();
		try {
			exc(time);
		} catch (UpsException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		
	}

}
