package codevita;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class lexico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		int n=in.nextInt();
		String P="",S;
		
		ArrayList<Integer> a=new ArrayList<Integer>();
			in.nextLine();
			while(n>0)
			{
			P=in.nextLine();
			S=in.nextLine();
			
			for(int i=0;i<S.length();i++)
			{
				for(int j=0;j<P.length();j++)
				{
					if (S.charAt(i)==P.charAt(j))
					{
						a.add(j);
					}
				}
			}
			

			n--;
			}
			Collections.sort(a);
			String store="";
			for(int b:a)
			{
				store=store+P.charAt(b);
			}
			
			System.out.println(store);
			
	
}

}
