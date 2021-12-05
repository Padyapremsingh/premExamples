package com.dnpass.training.java.day6;

public class StringConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Using 2 Ways
		
		// Using + Operator
		String s1="Prem ";
		String s2="Singh";
		String CompleteName =s1+s2;
		System.out.println("Using + Operator..! ");
		System.out.println("Complete Name of the Candidate Is : "+CompleteName);
		//Using Concat() Method
		System.out.println("Using Concat() Method ...! ");
		System.out.println(s1.concat(s2));
		System.out.println(s2.concat(s1));

	}

}
