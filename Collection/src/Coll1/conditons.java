package Coll1;
import java.util.*;
class conditons {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.println("enter");
		String email2=in.next();
		int n=email2.lastIndexOf('/');
		String email,roll;
		email=email2.substring(0, n);
		roll=email2.substring(n+1);
		System.out.println("email="+email);
		System.out.println("roll="+roll);
	}

}
