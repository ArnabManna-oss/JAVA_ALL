package Coll1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TEST2 {

	public static void main(String[] args) {
//		List<Integer> col= new ArrayList<Integer>();
		ArrayList col= new ArrayList();
		col.add(1);
		col.add(2);
		col.add(4);
		col.add(5);
//		System.out.println(col);
		col.add(2, 3);
		col.add("wallah");
//		System.out.println(col);
		
//		for (Object x: col) {
//			System.out.println(x);
//			
//		}
		
		Iterator a= col.iterator();
		
		while (a.hasNext()) {
			System.out.println(a.next());
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
