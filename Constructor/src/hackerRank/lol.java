package hackerRank;

import java.util.Scanner;

public class lol {
	int sd(int n){
		int a,s=0;
		while (n>0) {
			a=n%10;
			s=s+a*a;
			n/=10;
		}
		return s;
	}
	boolean LOL(int n){
		int m=n;
		while(m>9){
			m=sd(m);
		}
		if (m==1)
			return true;
		else 
			return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt(),m=in.nextInt(),i;
		lol l=new lol();
		for(i=n;i<=m;i++){
			if(l.LOL(i))
				System.out.print(i+" ");
		}
	}

}
