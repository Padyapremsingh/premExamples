package com.dnpass.training.java.day7.samples;

public class MyCalculator {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		int int1=3,int2=0;
		System.out.println(power(int1,int2));
		
	}
	private static long power(int int1,int int2)  {
		try {
		if (int1<=0 || int2<=0) {
			throw new ArithmeticException("Value is negative");		
		}
		}
		catch(ArithmeticException e) {
		System.out.println("Value is negative");	
		}
		return (long) Math.pow(int1, int2);
	}
}
