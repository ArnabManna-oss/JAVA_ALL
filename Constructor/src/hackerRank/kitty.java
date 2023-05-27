//kitty traveling problem
/*4 paths 6 combinations
 * 1->2
 * 2->3
 * 3->4
 * 4->1
 * 1->3
 * 2->4
 * 
 * 1->2->3->4->1
 * 2->3->4->1
 * 1->3->4->1
 * 
 * ans 3*/
package hackerRank;
import java.util.*;
public class kitty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int m=in.nextInt(),n=in.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		
		int i,j,c,count=0,p1,p2,v;
		for(i=0;i<n;i++) {
			a[i]=in.nextInt();
			b[i]=in.nextInt();
		}
		
		for(i=0;i<n;i++)
		{
			p1=a[i];
			p2=b[i];
			c=0;
			v=i;
			for(j=v;c<m;j=(j+1)%n)
			{
				if(a[j]==p2)
				{
					p2=b[j];
				}
				if(p1==p2)
				{
					count++;
				}
				c++;
			}
		}
		System.out.println(count);
	}

}
