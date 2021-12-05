package com.dnpass.training.java.day2;

import java.util.Scanner;

public class MaxNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		System.out.println("Enter the Value of A : ");
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		System.out.println("Enter the Value of B : ");
		b=sc.nextInt();
		sc.close();
		if(a>b)
		{
			System.out.println("Entered Value of A : "+a);
			System.out.println(" is Bigger ");
			
		}
		else if(a<b)
		{
			System.out.println("Entered Value of B : "+b);
			System.out.println(" is Bigger ");
		
		}
		else
		{
			System.out.println("Entered Value of A : "+a);
			System.out.println("Entered Value of B : "+b);
			System.out.println(" are Same");		
		}
	}

}
