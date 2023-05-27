package REG;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class pro {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
//		String reg="\\w*(?i)bal";
//		System.out.println("enter a name to check its pro or not");
		String reg="^T91/IT/\\d{7}";
		System.out.println("enter your roll number");
		
		String name=in.nextLine();
		
		Pattern pt=Pattern.compile(reg);
		Matcher m=pt.matcher(name);
		if(m.matches())
			System.out.println("its a bal name");
		else
			System.out.println("its a good name");

	}

}
