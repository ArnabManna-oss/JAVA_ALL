package Coll1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class work1 {

	public static void main(String[] args) {
		
		Emp e= new Emp(1, "Ajay", 6000);
		Emp e1= new Emp(2, "Bjay", 2000);
		Emp e2= new Emp(3, "Cjay", 5000);
		
		LinkedList<Emp> col= new LinkedList<Emp>();
		
		col.add(e);
		col.add(e1);
		col.add(e2);
		
		
		Comparator<Emp> ob= new compare_Emp();
		Collections.sort(col, ob);
		
		System.out.println("Eid\tEname\tSalary");
		for(Emp x:col)
		{
			System.out.println(x);
			//System.out.println(x.getId()+"\t"+x.getName()+"\t"+x.getSalary());
		}
		

	}

}
