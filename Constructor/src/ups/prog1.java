package ups;

import java.util.*;
public class prog1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int a;
		double b;
		char c;
		float f;
		String s;
		
		System.out.println("enter the String :");
		s=in.nextLine();
		System.out.println("enter the int :");
		a=in.nextInt();
		System.out.println("enter the double :");
		b=in.nextDouble();
		System.out.println("enter the char :");
		c=in.next().charAt(0);
		System.out.println("enter the float:");
		f=in.nextFloat();
		
		
		
		//System.out.printf("int =%d double=%f char=%c float=%f string=%s",a,b,c,f,s);
		System.out.println("int ="+a+"\n double="+b+" \nchar="+c+"\n float="+f+"\n String="+s);
		
		
		
	}

}
