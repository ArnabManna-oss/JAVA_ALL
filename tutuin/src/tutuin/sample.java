package tutuin;
//import java.util.*;
//import java.util.PrimitiveIterator.OfDouble;
//
//
//public class sample {
//
//	public static void main(String[] args) {
//	Scanner in= new Scanner(System.in);
//	int T;
//	T=in.nextInt();
//	for(int i=1;i<=T;i++)
//	{
//		System.out.println("Case #" + i + ": ");
//		solve();
//	}
//  }
//	
//static void solve() {
//	Scanner in= new Scanner(System.in);
//	int n,m;
//	n=in.nextInt();
//	m=in.nextInt();
//	int bag[]=new int[n];
//	for(int i=0;i<n;++i)
//	{
//		bag[i]=in.nextInt();
//	}
//	int c=0;
//	for(int j:bag)
//	{
//		c+=j;
//	}
//	//System.out.println(c);
//	int lfov=c%m;
//	
//	System.out.println(lfov);
//	
//}
//}
import java.util.Scanner;

public class sample {
  // Object for Input
  static Scanner inputObject = new Scanner(System.in);

  public static void main(String args[]) {
    // Declare integer 'T' (Number of Test Cases)
    int T;
    // & read it from Standard Input
    T = inputObject.nextInt();
    // Loop through the number of Test Cases [1, T]
    for (int test_case = 1; test_case <= T; ++test_case) {
      // Print the Test Case Number to Standard Output
      System.out.print("Case #" + test_case + ": ");
      // Call the 'solve()' function to answer each test
      solve();
    }
    // Close the Object for Input
    inputObject.close();
  }

  static void solve() {
    // Declare the integers N (Number of Boxes) & M (Number of Kids)
    int N, M;
    // Read Integers N & M from Standard Input
    N = inputObject.nextInt();
    M = inputObject.nextInt();
    // Declare an array 'C' (Candies) of size 'N'
    int[] C = new int[N];
    // Read the array 'C' from Standard Input
    for (int i = 0; i < N; ++i) {
      C[i] = inputObject.nextInt();
    }
    // Declare integer 'totalCandies' to store the overall count of Candies in all boxes
    int totalCandies = 0;
    // Calculate the sum (totalCandies) by iterating through array 'C'
    for (int i = 0; i < N; ++i) {
      totalCandies += C[i];
    }
    // Every Kid will get 'floor(totalCandies / M)' Candies
    // Hence, Left Out Candies will be (totalCandies % M).
    int leftOutCandies = totalCandies % M;
    // Print 'leftOutCandies' (ans) to Standard Output
    System.out.println(leftOutCandies);
  }
}
