package DynamicPrograming;

import java.time.chrono.MinguoChronology;

public class Coin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=18;
		int a[]= {7,5,1};
		int ans=minCoin(n, a);
		System.out.println(ans);
	}
	
	static int minCoin(int n,int a[]) {
		
		if(n==0) return 0;
		
		int ans=Integer.MAX_VALUE;
		
		for(int i=0;i<a.length;i++) {
			if(n-a[i]>=0) {
				int subAns=minCoin(n-a[i], a);
				
				if(subAns!=Integer.MAX_VALUE && subAns+1 <ans) {
					ans=subAns+1;
				}
			}
		}
		return ans;
	}
}
