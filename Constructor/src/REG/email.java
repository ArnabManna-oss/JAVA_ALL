package REG;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class email {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String exp="\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b";
		/* //b to //b is bounded
		 * [\\w.%-] word including . % - 
		 */
		System.out.println("enter a email address no to validate :");
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
