package com.infinity.test1;

//Method is abstract then class is also abstract.
public abstract class Account extends Object {
	private int accountNumber;
	private String accountHolder;
	private double accountBalance;

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public Account() {

	}

	public Account(int accountNumber, String accountHolder, double accountBalance) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.accountBalance = accountBalance;
	}

	public abstract void showAccount(); //Abstract method does not have body.
	
}
