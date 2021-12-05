package com.dnpass.training.java.day0;

public class StringsCompleteDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("For Strings");
		String str="Hello";
		
		System.out.println(str);
		
		char [] a1= {'a','b','c','d'};
		String z=new String(a1);
		System.out.println(a1);
		
		//
		System.out.println("For Integers");
		int a=10;
		//
		String s=Integer.toString(a);
		System.out.println(s);
		//or
		String s1=s.valueOf(a);
		System.out.println(s1);	
		
		System.out.println("For Double");
		
		double ab=21.22;
		String str1=Double.toString(ab);
		System.out.println(ab);
		
		System.out.println("For Boolean");
		boolean value1=true;
		boolean value2=false;
		System.out.println(value1);
		
	}

}
