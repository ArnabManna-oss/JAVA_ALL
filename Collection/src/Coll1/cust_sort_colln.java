package Coll1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class cust_sort_colln {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> coll=new LinkedList<Integer>();
		
		coll.add(485);
		coll.add(493);
		coll.add(508);
		coll.add(457);
		coll.add(461);
		coll.add(479);
		System.out.println("unsorted");
		for (Object x: coll) {
			System.out.println(x);
		}
		Comparator<Integer> ob= new compare();
		Collections.sort(coll, ob);
		
		System.out.println("sorted based on last digit");
		for (Object x: coll) {
			System.out.println(x);
		}
		
	}

}
