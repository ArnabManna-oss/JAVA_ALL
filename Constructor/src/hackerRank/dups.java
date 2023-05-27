package hackerRank;

import java.util.Scanner;

public class dups {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String st=in.nextLine(),s=st.charAt(0)+"";
		for(int i=0;i<st.length()-1;i++)
		{
			char c=st.charAt(i);
			char c1=st.charAt(i+1);
			if(c==c1)
			{
				s=s+"";
			}
			else {
				s=s+c1;
			}
		}
		System.out.println(s);

	}

}
