package tutuin;

import java.util.*;
public class pr
{
    public static void main(String args[])
    {
    	int a,b,c;
    	Scanner in= new Scanner(System.in);
    	System.out.println("enter 3 numbers");
    	a=in.nextInt();//54
    	b=in.nextInt();//24
    	c=in.nextInt();//1
    	
    	int max,min,mid;
    	
    	int s=Math.max(b,c);//24
    	
    	int s1=Math.min(c, b);//1
    	
    	max= Math.max(a,s);//54
    	min= Math.min(a, s1);//1
    	mid=(a+b+c)-(max+min);//24
    	
    	System.out.println("ascending order is ="+min+","+mid+","+max);
    	System.out.println("descending order is ="+max+","+mid+","+min);
    }
}















//value   a=13,b=66,c=100

//value   a=500,b=100,c=3000

//value   a=300,b=500,c=1
















