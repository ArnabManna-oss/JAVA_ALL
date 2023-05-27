package ArrayDs;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ar1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String week[]=new String[7];
		week[0]="Sunday";
		System.out.println(Arrays.toString(week));
		
		week=new String[] {"Monday","tuesday","wednesday"};
		for(String s:week)
		{
			System.out.println(s);
		}
		
		
		

	}

}
