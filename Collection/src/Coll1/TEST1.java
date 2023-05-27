package Coll1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
//collection is good but no idexig is available
// the value always appends at the last
public class TEST1 {
	public static void main(String[] args) {
		//Collection<Integer> coll=new ArrayList<Integer>();
		ArrayList<Integer> coll=new ArrayList<Integer>();
		
		coll.add(48);
		coll.add(49);
		coll.add(50);
		coll.add(45);
		coll.add(46);
		coll.add(47);
		
		Collections.sort(coll);
//		coll.add("hello");
//		coll.add(8.998);
//			
//	System.out.println(coll);	
//		
//		coll.remove(46);
//		coll.remove(48);
	System.out.println(coll);
	
	Collections.reverse(coll);
	System.out.println(coll);
	
	}
}
