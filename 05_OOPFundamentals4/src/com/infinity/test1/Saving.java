package com.infinity.test1;

public class Saving extends Account {
	private double roi;

	public Saving(int number, String holder, double balance, double roi) {
		super(number, holder, balance);
		this.roi = roi;
	}

	@Override
	public void showAccount()
	{
		System.out.println("Account Number = "+super.getAccountNumber());
		System.out.println("Account Holder = "+super.getAccountHolder());
		System.out.println("Account Balance = "+super.getAccountBalance());
		System.out.println("Account ROI = "+roi);
	}
}
