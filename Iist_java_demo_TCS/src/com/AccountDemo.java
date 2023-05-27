package com;

import java.util.ArrayList;
import java.util.HashSet;

public class AccountDemo {
	public static void main(String[] args) {
		ArrayList<Account> accList=new  ArrayList<Account>();
		HashSet<Integer> custIdSet = new HashSet<Integer>();
		
		Account a1= new Account(1001, 5000, 118);
		Account a2= new Account(1002, 5000, 111);
		Account a3= new Account(1002, 5000, 113);
		Account a4= new Account(1004, 5000, 117);
		Account a5= new Account(1004, 5000, 111);
		
		accList.add(a1);
		accList.add(a2);
		accList.add(a3);
		accList.add(a4);
		accList.add(a5);
		
		custIdSet=AccountDemo.getUniqueCustomers(accList);
		System.out.println("Set of Customer Id are :"+custIdSet);
	}
	private static HashSet<Integer> getUniqueCustomers(ArrayList<Account> accounts) {
		HashSet<Integer> customerIdSet= new HashSet<Integer>();
		for(Account acc:accounts)
		{
			customerIdSet.add(acc.getAccountId());
		}
		return customerIdSet;
	}
}
