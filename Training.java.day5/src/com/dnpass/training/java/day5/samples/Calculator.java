package com.dnpass.training.java.day5.samples;

public class Calculator {

	public int add(int... value)
	{
		int sum=0;
		for(int i:value)
			sum+=i;
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal1=new Calculator();
		int add = cal1.add(1,2,3);
		System.out.println(add);
	}

}
