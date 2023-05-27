package sET;

import java.util.HashSet;
import java.util.Set;

public class FindDups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> unique= new HashSet<String>();
		Set<String> dup=new HashSet<String>();
		System.out.println("ok");
		for(String a: args) {
			if(!unique.add(a)) {
				dup.add(a);
			}
		}
			unique.removeAll(dup);
			System.out.println("unique  words ="+unique);
			System.out.println("dupicate words ="+dup);
		
	}
}
