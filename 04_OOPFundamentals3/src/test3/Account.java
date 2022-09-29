package test3;

public class Account extends Object {
	private int accountNumber;
	private String accountHolder;
	private double accountBalance;

	public Account(int accountNumber, String accountHolder, double accountBalance) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.accountBalance = accountBalance;
	}

	public void display() {
		System.out.println("Account Number = " + accountNumber);
		System.out.println("Account Holder = " + accountHolder);
		System.out.println("Account Balance = " + accountBalance);
		//System.out.println("-------------------------------------------------------------");
	}
}
