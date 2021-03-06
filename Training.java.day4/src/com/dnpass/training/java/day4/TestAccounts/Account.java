package com.dnpass.training.java.day4.TestAccounts;

//import java.math.*;

public class Account implements Greetings{
	private int accountNumber;
	private double accountBalance;
	private static int AutomaticAccountNo = 0;

	// getter and setter
	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	// constructor
	public Account() {
		AutomaticAccountNo++;
		this.setAccountNumber(AutomaticAccountNo);
		this.setAccountBalance(0);
		this.showDetails();

	}

	public Account(int accountBalance) {
		AutomaticAccountNo++;
		this.setAccountNumber(AutomaticAccountNo);
		this.setAccountBalance(accountBalance);
		this.showDetails();
	}

	public Account(int accountNumber, double accountBalance) {
		this.setAccountNumber(accountNumber);
		this.setAccountBalance(accountBalance);
		this.showDetails();
	}

	// Account class functions
	public void changeAccountNumber(int accountNumber) {
		this.setAccountNumber(accountNumber);
		System.out.println("Account Number Changed");
		this.showDetails();
	}

	public void showDetails() {
		System.out.println(
				"Account Number :" + this.getAccountNumber() + "\tAccount Balance :" + this.getAccountBalance());
	}

	public void deposit(double amount) {
		if (amount > 0) {
			this.setAccountBalance(amount + this.getAccountBalance());
			System.out.println("Deposit Successfull from Account :" + this.getAccountNumber());
			this.showDetails();
		} else {
			System.out.println("amount too low for deposit.");
		}
	}

	public void withdraw(double amount) {
		if (this.getAccountBalance() < amount) {
			System.out.println("Balance Low! to Withdraw.");
		} else {
			this.setAccountBalance(this.getAccountBalance() - amount);
			System.out.println("Withdraw Successfull from Account :" + this.getAccountNumber());
			this.showDetails();
		}
	}

	public void transfer(double amount, Account acc) {
		// System.out.println(acc.getAccountNumber());;
		if (this.getAccountBalance() < amount) {
			System.out.println("Balance Low! to Transfer.");
		} else {
			this.setAccountBalance(this.getAccountBalance() - amount);
			acc.setAccountBalance(acc.accountBalance + amount);
			System.out.println("Transfer Successfull to Account :" + acc.getAccountNumber());
			this.showDetails();
			acc.showDetails();
		}
	}

	@Override
	public void Welcome() {
		// TODO Auto-generated method stub
		System.out.println("Welcome...");
		
	}

	@Override
	public void ThankYou() {
		// TODO Auto-generated method stub
		System.out.println("thank you...");
		
	}
}
