package com.dnpass.training.java.day4.Sample;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string :");
		String str=sc.next();
		if(str.length()%2==0)
		{
			checkPalindrome(str.substring(0,str.length()/2),str.substring((str.length()/2),str.length()));
			//System.out.println(str.length()/2);
		}
		else {
			checkPalindrome(str.substring(0,str.length()/2),str.substring((str.length()/2)+1,str.length()));
		}
	}
	private static void checkPalindrome(String str1,String str2)
	{
		System.out.println(str1+" "+str2);
		StringBuilder sb=new StringBuilder(str2);  
	    sb.reverse();
	    if(str1.contentEquals(sb)) {
	    	System.out.println("string is palindrome");
	    }
	    else {
	    	System.out.println("string is not a palindrome");
	    }
	}
}
