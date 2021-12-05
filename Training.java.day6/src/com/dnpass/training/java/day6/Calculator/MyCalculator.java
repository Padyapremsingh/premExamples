package com.dnpass.training.java.day6.Calculator;

import java.util.Scanner;

public class MyCalculator implements AdvancedArithmetic{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value: ");
		int value = sc.nextInt();
		//while(value!=0) {
			System.out.println(divisor_sum(value));
//			System.out.println("Enter value: ");
//			value = sc.nextInt();	
//	}
}

	public static int divisor_sum(int value) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1;i<value+1;i++) {
			if(value%i==0)
				sum+=i;
		}
		return sum;
	}
	
	
}
