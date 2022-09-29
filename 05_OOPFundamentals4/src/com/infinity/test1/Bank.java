package com.infinity.test1;

public class Bank {

	public static void main(String[] args) {
		// we have declared the class Account as abstract
		// Account account = new Account();
		Account account = null;
		Saving saving = new Saving(101010, "Virat Kohli", 1000, 4.5);
		Current current = new Current(110011, "Infinity .Ltd", 500000, 50000);

		if (Math.random() > 0.5) {
			account = saving;
		} else {
			account = current;
		}

		/*
		 * instanceof used to check whether a object is instance of that particular
		 * class or not.
		 */
		if (account instanceof Saving)
			System.out.println("Saving acc is created");
		else
			System.out.println("Current acc is created");

		System.out.println();

		account.showAccount();
	}

}
