package com.dnpass.training.java.day4.Sample.StringReverseCharIns;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String :");
		String str = sc.next();
		System.out.print("Enter the Character :");
		char ch = sc.next().charAt(0);
		System.out.println(UserMainCode.reshape(str, ch));
	}

}
