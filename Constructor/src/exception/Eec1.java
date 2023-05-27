package exception;

public class Eec1 {

	public static void main(String[] args) {
		int a=10;
		int b=10;
		int c=5;
		try {
		int res=c/(a-b);
		System.out.println("Result= "+res);
		}catch(ArithmeticException e)
		{
			System.out.println("as the integer i devided by zero the Program Terminated!");
		}
		int res2=c/(a+b);
		System.out.println("Second Result= "+res2);
		}
}