package com.dnpass.training.java.day4.Sample;

import java.util.Scanner;

public class StringPangrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		String s;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string :");
		String str=sc.nextLine().replace(" ", "").toLowerCase();
//		for(String s:str) {
//			System.out.println(s);
//		}
		char[] alphabets = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		
		for(int i=0;i<str.length();i++) {
			for(int j=0;j<alphabets.length;j++)
			{
				if((str.charAt(i))==(alphabets[j])) {
					alphabets[j]= 0;
					count++;
				}
			}
		}

		if(count==26) {
			System.out.println("Pangram");
		}
		else{
				System.out.println("not Pangram");
		}
	}
}
