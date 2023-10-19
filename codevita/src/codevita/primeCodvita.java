package codevita;

import java.util.Arrays;
import java.util.Scanner;
/*Q1
PrimeConstructionMarks: 30
Problem Description
A math game is introduced in a school competition to test the skills of students. The game deals with Prime numbers.
The game rules are as follows:
•	From the given set of distinct natural numbers as input, consider the smallest natural number as q.
•	Your task is to compute the smallest prime number (p) such that when p is divided by all the distinct numbers in the input, except q, should result q as the remainder.
Constraints
1 < n < 11
p < 10 ^ 10
Input
Input consists of n+1 number of distinct natural numbers separated by spaces.
Output
Print single integer p if such a p exists, else print "None".
Time Limit (secs)
1
Examples
Input
3 4 5 1
Output
61
Explanation
Here the n+1 numbers are 3, 4, 5 and 1 where q=1 (the least of the numbers)
The smallest number that leaves remainder 1 when divided by 3, 4 and 5 is 61 and is prime. Hence, output is 61.
Example 2
Input
3 4 5 2
Output
None
Explanation
Here q=2. Any number that when divided by 4 leaving remainder 2 must be an even number e.g., 6, 10, 14 etc. Hence it can't be prime. Hence, output is "None"

*/
public class primeCodvita {
	
	static boolean  isprime(long n) {
		long i,c=0;
		for(i=2;i<Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
				c++;
			}
		}
		if(c==0) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner in= new Scanner(System.in);
		String inp=in.nextLine();
		String ip[]=inp.split(" ");
		int n=ip.length-1;
		int arr[]=new int[n+1];
		int i;
		for(i=0;i<n+1;i++)
		{
			arr[i]=Integer.parseInt(ip[i]);
		}
//		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr);
		
//		System.out.println(Arrays.toString(arr));
		
		int min= arr[0];
		
		int max=arr[n];
		int k;
		long j,no=0;
		long c=0;
		boolean sta=false;
		if(min%2==0)
		{
			System.out.println("None");
		}
		else 
		{
		for(j=max*2;j<=Long.MAX_VALUE;j++)
		{
			if(isprime(j))
			{
//				System.out.println(n);
				c=0;
				for(k=1;k<=n;k++)
				{	
					if(j%arr[k]==min)
					{
//						System.out.println("arr="+arr[k]);
						c++;
//						System.out.println("c="+c);
						if(c==n)
						{
							no=j;
							sta=true;
							break;
						}
					}
				}
				
//				System.out.println(j);
//				c++;
//				if(c>20)
//					break;
			}
			if(sta)
			{
				break;
			}
				
		}
		
		if(sta)
		{
			System.out.println(no);
		}
//		else {
//			System.out.println("None");
//		}
			
		}
		
		
//		System.out.println("min="+min+" max="+max);

		
		
		
		
	}
}
