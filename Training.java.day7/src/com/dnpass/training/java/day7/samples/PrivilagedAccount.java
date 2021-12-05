package com.dnpass.training.java.day7.samples;

public class PrivilagedAccount extends Account {
	public void withdraw(double Amount) {
		super.setAccountBalance(super.getAccountBalance()-Amount);
	}

}
