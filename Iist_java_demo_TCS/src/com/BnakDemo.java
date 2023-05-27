package com;

import java.util.ArrayList;

public class BnakDemo {
	
	public static void main(String[] args) {
		ArrayList<Account> acc=new ArrayList<Account>();
		Account acc1=new Account(1001,5000,1200);
		Account acc2=new Account(1002,10000,1201);
		Account acc3=new Account(1003,15000,1202);
		Account acc4=new Account(1004,20000,1203);
		Account acc5=new Account(1005,25000,1204);
		
		acc.add(acc1);
		acc.add(acc2);
		acc.add(acc3);
		acc.add(acc4);
		acc.add(acc5);
		
		Bank bk=new Bank(acc);
		bk.Deposit(2000, 1001);
		bk.Withdraw(5000, 1003);
		bk.Deposit(10000, 1204);
		
	}
}
