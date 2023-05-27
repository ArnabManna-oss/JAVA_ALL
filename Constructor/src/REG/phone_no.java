package REG;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class phone_no {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String exp="\\+91\\d{10}";
		System.out.println("enter a phone no to validate :");
		String ph=in.nextLine();
		
		Pattern p=Pattern.compile(exp);
		Matcher m=p.matcher(ph);
		
		boolean b=m.matches();
		
		if(b)
			System.out.println("valid");
		else 
			System.out.println("invalid");
	}

}
