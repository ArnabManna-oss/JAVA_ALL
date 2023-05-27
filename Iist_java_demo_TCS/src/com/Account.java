package com;

public class Account {
	int accountId;
	double balance;
	int customerId;
	
//	public Account() {
//		// TODO Auto-generated constructor stub
//	}
	public Account(int accountId, double balance, int customerId) {
		super();
		this.accountId = accountId;
		this.balance = balance;
		this.customerId = customerId;
	}
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public double deposit(double ammount) {
		this.balance+=ammount;
		return this.balance;
	}
	public double withdraw(double ammount) {
		this.balance+=ammount;
		return this.balance;
	}
}
