package com.dnpass.training.java.day4.Sample;

import java.util.Scanner;

public class ReplaceChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string :");
		String str=sc.nextLine();
		System.out.println("\'d\' is replaced with \'h\'\n"+str.replace('d', 'h'));
	}

}
