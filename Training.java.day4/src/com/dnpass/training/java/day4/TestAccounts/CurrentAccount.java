package com.dnpass.training.java.day4.TestAccounts;

public class CurrentAccount extends Account {
	private static final int freeTransaction = 2;
	private static int CurrentTransaction = 0;
	private static final double transactionFee = 2.0;

//constructor
	public CurrentAccount(int accountNumber, double accountBalance) {
		super(accountNumber, accountBalance);
		
		//this.transactionFee();
	}

//Current account class function
//	public void transactionFee() {
//		if (this.CurrentTransaction > this.freeTransaction) {
//			super.deposit(transactionFee + this.getAccountBalance());
//			// this.showDetails();
//		}
//		
//	}

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		CurrentTransaction++;
		if (this.CurrentTransaction > this.freeTransaction) {
			super.withdraw(transactionFee );
		}
		super.deposit(amount);
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		CurrentTransaction++;
		if (this.CurrentTransaction > this.freeTransaction) {
			super.withdraw(transactionFee);
		}
		super.withdraw(amount);
	}

	@Override
	public void transfer(double amount, Account acc) {
		CurrentTransaction++;
		if (this.CurrentTransaction > this.freeTransaction) {
			super.withdraw(transactionFee );
		}
		super.transfer(amount, acc);
	}
}
