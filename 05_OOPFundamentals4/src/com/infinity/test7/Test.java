package com.infinity.test7;

//Customer should have a account
class Account {
	int accountNumber;

	@Override
	public String toString() {
		return "account Number = " + accountNumber;
	}

}

//Customer has a account
class Customer {
	String customerName;
	Account account = new Account(); // Customer has a account

	@Override
	public String toString() {
		return "Name = " + customerName + " , Account = " + account;
	}
}

public class Test {

	public static void main(String[] args) {
		Customer obj = new Customer();
		obj.customerName = "Virat Kohli";
		obj.account.accountNumber = 10101;

		System.out.println(obj);
	}

}
