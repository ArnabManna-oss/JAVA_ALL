package Sh;
import java.util.*;
public class Test1 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter string");
		String s1=in.nextLine();//input
		String s="";
		
		for(int i=0;i<s1.length();i++) {
			char c=s1.charAt(i);
			s=c+s;
		}
		if (s1.equals(s)) {
			System.out.println("palindrome String");
		}
		else {
			System.out.println("not palindrome");
		}
		
	}
}
