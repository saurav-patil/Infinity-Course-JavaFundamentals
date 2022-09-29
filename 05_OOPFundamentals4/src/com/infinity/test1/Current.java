package com.infinity.test1;

public class Current extends Account {
	private double overdraft;

	public Current(int number, String holder, double balance, double overdraft) {
		super(number, holder, balance);
		this.overdraft = overdraft;
	}
	
	//Override the abstract method from parent class into child class.
	@Override
	public void showAccount()
	{
		System.out.println("Account Number = "+getAccountNumber());
		System.out.println("Account Holder = "+getAccountHolder());
		System.out.println("Account Balance = "+getAccountBalance());
		System.out.println("Account Overdraft = "+overdraft);
	}
	
}
