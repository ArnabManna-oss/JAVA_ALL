package com;

import java.util.ArrayList;

public class Bank {

	ArrayList<Account> accounts;

	public Bank(ArrayList<Account> accounts) {
		this.accounts = accounts;
	}
	public double Deposit(double ammount,int accountId) {
		double finalbalance=0;
		for(Account acc:accounts) {
			if(acc.getAccountId()==accountId)
			{
				finalbalance=acc.deposit(ammount);
				System.out.println("balance successfuly deposited , new balance is ="+finalbalance);
				return finalbalance;
			}
		}
			System.out.println("Account don't exist");
		return -1;
	}
	public double Withdraw(double ammount,int accountId) {
		double finalbalance=0;
		for(Account acc:accounts) {
			if(acc.getAccountId()==accountId)
			{
				finalbalance=acc.withdraw(ammount);
				System.out.println("balance successfuly withdrawn , new balance is ="+finalbalance);
				return finalbalance;
			}
		}
			System.out.println("Account don't exist");
		return -1;
	}
	
}
