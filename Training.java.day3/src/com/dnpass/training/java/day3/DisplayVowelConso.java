package com.dnpass.training.java.day3;

import java.util.Scanner;

public class DisplayVowelConso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			char alpha;
			Scanner sc= new Scanner(System.in);
			System.out.println("ENter a Character : ");
			alpha=sc.nextLine().charAt(0);
			sc.close();
			if(alpha=='a' || alpha=='e' || alpha =='i' || alpha=='o' || alpha=='u')
			{
				System.out.println("It is a Vowel...!");
			}
			else
			{
				System.out.println("It is a Consonent...!");
			}
	}

}
