package show1;
import java.util.*;
public class userinp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		int a;
		double d;
		char c;
		String s;
		
		a=in.nextInt();
		d=in.nextDouble();
		s=in.next();
		c=in.next().charAt(0);
		
		
		System.out.println(a+" "+d+" "+c+" "+s);
	}

}
