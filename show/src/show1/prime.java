package show1;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a,p,m=0;
		System.out.println("enter a number");
		p=in.nextInt();
		
		a=2;
		do
		{
			if (p%a==0) {
				m++;
			}
			a++;
		}while(a<(p/2));
		
		
		if (m==0) {
			System.out.println("prime");
		}
		else {
			System.out.println("not prime");
		}
	}
}
