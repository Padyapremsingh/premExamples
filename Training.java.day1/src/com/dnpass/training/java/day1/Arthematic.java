package com.dnpass.training.java.day1;

import java.util.Scanner;

public class Arthematic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		int total1,total5, total2,total3,total4;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Value of A : ");
		a=sc.nextInt();		
		System.out.println("Enter the Value of B : ");
		b=sc.nextInt();
		System.out.println("Enter the Value of C : ");
		sc.close();
		total1 = (a+b);
		total2 = (a-b);
		total3=(a*b);
		total4=(a/b);
		total5=(a%b);
		System.out.println("The Total Value is : "+total1);
		System.out.println("The Total Value is : "+total2);
		System.out.println("The Total Value is : "+total3);
		System.out.println("The Total Value is : "+total4);
		System.out.println("The Total Value is : "+total5);

	}

}
