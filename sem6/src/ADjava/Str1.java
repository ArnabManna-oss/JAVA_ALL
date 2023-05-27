package ADjava;

import java.util.*;


public class Str1 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		char ch;
		System.out.println("input a character :");
		ch=in.next().charAt(0);
		// a,e,i,o,u  A,E,I,O,U
//		if((ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') ||  (ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'))
//		{
//			System.out.println("vowel");
//		}
		ch=Character.toLowerCase(ch);
		System.out.println(ch);
		if((ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'))
		{
			System.out.println("vowel");
		}
		else {
			System.out.println("consonant");
		}
		
		
	}
}
