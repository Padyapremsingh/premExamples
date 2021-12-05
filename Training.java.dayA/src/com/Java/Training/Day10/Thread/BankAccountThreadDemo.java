package com.Java.Training.Day10.Thread;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccountThreadDemo {
	public static void main(String[] args) {
		BankAccount1 account=new BankAccount1();
		final double AMOUNT=100;
		final int REPITITIONS=10;
		
		DepositRunnable d=new DepositRunnable(account,AMOUNT,REPITITIONS);
		WithdrawRunnable w=new WithdrawRunnable(account,AMOUNT,REPITITIONS);
		
		Thread t1=new Thread(d);
		Thread t2=new Thread(w);
		
		t1.start();
		t2.start();
		
		
	}
	
}

class DepositRunnable implements Runnable{
	private static final int DELAY=ThreadDelay.DELAY;
	private BankAccount1 account;
	private double amount;
	private int count;
	public DepositRunnable(BankAccount1 anAccount, double anAmount, int aCount) {
	     account =anAccount;
		 amount = anAmount;
	     count = aCount;
	}
	public void run() {
		try {
			for(int i=1;i<=count;i++) {
				account.deposit(amount);
				Thread.sleep(DELAY);
			}
		}catch (InterruptedException exception) {
	}
	
}
}

class WithdrawRunnable implements Runnable {
	private static final int DELAY=ThreadDelay.DELAY;
	private BankAccount1 account;
	private double amount;
	private int count;
	public WithdrawRunnable(BankAccount1 anAccount, double anAmount, int aCount) {
		account = anAccount;
		amount = anAmount;
		count = aCount;
	}
	public void run() {
		try {
			for(int i=1;i<=count;i++) {
				account.withdraw(amount*2);
				Thread.sleep(DELAY);
			}
		}catch (InterruptedException exception) {
	}
}
}

class BankAccount {
	private double balance;
	public BankAccount() {
		balance=0;
	}
 public void deposit(double amount) {
	 double newBalance=balance+amount;
	 System.out.print("Depositing: "+amount+" new balance is: "+newBalance);

	 balance=newBalance;	 
 }
 public double getBalance() {
	 return balance;
 }
 public void withdraw(double amount) {
	 double newBalance=balance-amount;
	 System.out.println("withdrawing: "+amount+" new balance is: "+newBalance);
	 balance=newBalance;
	 
 }
 public double getBalance1() {
	 return balance;
 }
}



//class BankAccount1 {
//	private double balance;
//	private Lock balanceChangeLock;
//	
//	public BankAccount1() {
//		balance=0;
//		balanceChangeLock=new ReentrantLock();
//	}
//	public void deposit(double amount) {
//		balanceChangeLock.lock();
//		try {
//			System.out.println("Depositing"+amount);
//			double newBalance=balance+amount;
//			System.out.println("new balance is"+newBalance);
//			balance=newBalance;
//		}finally {
//			balanceChangeLock.unlock(); 
//		}
//	}
//}

class BankAccount1 {
	private double balance;
	private Lock balanceChangeLock;
	private Condition sufficientFundsCondition;
	public BankAccount1() {
		balance=0;
		balanceChangeLock=new ReentrantLock();
		sufficientFundsCondition=balanceChangeLock.newCondition();
	}
	public void deposit(double amount) {
		balanceChangeLock.lock();
		try {
			double newBalance=balance+amount;
			System.out.println("Depositing: "+amount+" new balance is: "+newBalance);
		    balance=newBalance;
		    sufficientFundsCondition.signalAll();	    
		}finally {
			balanceChangeLock.unlock();
		}
		
	}
	public void withdraw(double amount) {
		balanceChangeLock.lock();
		try {
			while(balance<amount) {
				System.out.println("INSUFFICIENT BALANCE!...");
				  sufficientFundsCondition.await();
			}
			double newBalance=balance-amount;
			System.out.println("withdrawing: "+amount+" new balance is: "+newBalance); 
			balance=newBalance;
		}catch (InterruptedException e) {
			e.printStackTrace();
		}finally {
			balanceChangeLock.unlock();
		}
	}
}
