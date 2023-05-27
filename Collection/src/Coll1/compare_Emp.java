package Coll1;

import java.util.Comparator;

public class compare_Emp implements Comparator<Emp>{
	public int compare(Emp o1, Emp o2) {
		// TODO Auto-generated method stub
		if (o1.getSalary()>o2.getSalary()) {
			return 1;			
		}
		return -1;
	}
}
