package com.dnpass.training.java.day4.Sample;

import java.util.Scanner;

public class StringModification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string :");
		String str = sc.next();
		if (str.length() < 100) {
			System.out.println(getString(str.toLowerCase()));
		} else {
			System.out.println("String length should be within 100.");
		}
	}

	private static String getString(String Str) {

//	abkaa
		StringBuilder sb=new StringBuilder(Str);
		if (sb.charAt(0) != 'k') {
			sb.deleteCharAt(0);
			if (sb.charAt(0) != 'b') {
				sb.deleteCharAt(0);
			} 
		} 
		else {
			if (sb.charAt(1) != 'b') {
				sb.deleteCharAt(1);
			} 
		}
		//System.out.println((sb.charAt(0) != 'k')?( (sb.charAt(0) != 'b') ? sb.delete(0,1) :(sb.deleteCharAt(0))):(sb.charAt(1) != 'b')?sb.deleteCharAt(1):sb);
		return sb.toString();
	}
}
